package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {

    @BeforeAll
    public static void setUp() {
//        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//
//        Configuration.browserCapabilities = capabilities;
////        Configuration.remote = "https://" + System.getProperty("selenoid_url") + ":4444/wd/hub/";
//        Configuration.remote = "https://selenoid.autotests.cloud:4444/wd/hub/";
    }

    @AfterEach
    public void closeBrowser() {
        closeWebDriver();
    }
}
