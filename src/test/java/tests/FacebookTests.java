package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.*;
import pages.FacebookPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Env.*;
import static pages.FacebookPage.firstName;
import static pages.FacebookPage.lastName;


@Epic("QA.GURU automation course")
@Story("Facebook tests")
@Tag("facebook")
public class FacebookTests extends TestBase {

    @Test
    @Disabled
    @Description("negative test with PageObject")
    void unsuccessfulLoginWithPageObject() {
        FacebookPage facebookPage = new FacebookPage();

        open(url);
        facebookPage.typeEmail(email);
        facebookPage.typePassword(password);
        facebookPage.clickSubmit();
        facebookPage.verifyIfBlocked();
    }

    @Test
    @Description("Positive test with PageObject")
    void successfulLoginWithPageObject() {
        FacebookPage facebookPage = new FacebookPage();

        open(url);
        facebookPage.typeEmail(myMail);
        facebookPage.typePassword(myPassword);
        facebookPage.clickSubmit();
        facebookPage.verifyLoggedInAsUser(firstName, lastName);
    }
}
