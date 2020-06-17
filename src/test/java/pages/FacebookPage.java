package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FacebookPage {
    SelenideElement emailInput = $(by("data-testid", "royal_email")),
            passwordInput = $(by("data-testid", "royal_pass")),
            submitButton = $(by("data-testid", "royal_login_button")),
            htmlBody = $("html");


    public static String isBlocked = "Ваш аккаунт отключен";
    public static String firstName = "Александр";
    public static String lastName = "Богданов";

    @Step("Type email {email}")
    public void typeEmail(String email) {
        emailInput.setValue(email);
    }

    @Step("Type password {password}")
    public void typePassword(String password) {
        passwordInput.setValue(password);
    }

    @Step("Click submit button")
    public void clickSubmit() {
        submitButton.click();
    }

    @Step("Verify logged in as {firstName} {lastName}")
    public void verifyLoggedInAsUser(String firstName, String lastName) {
        htmlBody.shouldHave(text(firstName), text(lastName));
    }

    @Step("Verify if account is blocked")
    public void verifyIfBlocked() {
        $(byText(isBlocked)).shouldBe(visible);
    }
}
