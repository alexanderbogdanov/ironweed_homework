package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.*;
import pages.FacebookPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.WebDriverRunner.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Env.*;


@Epic("QA.GURU automation course")
@Story("Lepra tests")
@Tag("lepra_tests")
public class LepraTests extends TestBase {

    @Test
    @Description("Change Surname In Profile")
    @DisplayName("Изменение фамилии в профиле")
    void changeSurnameinProfile() {
//        FacebookPage facebookPage = new FacebookPage();
        String randomSurname = RandomStringUtils.randomAlphabetic(10);
        open(lepraUrl);
        Assert.assertEquals("https://leprosorium.ru/login/", url()); //        assert if on login page
        $("#js-login > div.b-login_navigation > a.b-login_navigation_auth").click();
        $(byName("username")).setValue(lepraUsername);
        $(byName("password")).setValue(lepraPassword).pressEnter();
        $("div.l-header_tagline a").shouldHave(text(lepraUsername));
        $("div.l-header_tagline a").click();
        $("div.b-user_edit_info > a").click();
        $(byName("last_name")).setValue(randomSurname);
        $(by("alt", "ahoy!")).click();
        open(lepraUrl);
        $("div.l-header_tagline a").click();
        $("div.b-user_edit_info > a").click();
        $(byName("last_name")).shouldHave(value(randomSurname));
    }
}