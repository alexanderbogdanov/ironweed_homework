package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import pages.YaMarketPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Env.*;

@Epic("QA.GURU automation course")
@Story("Yandex Market Tests")
@Tag("yandex_market")
class YandexMarketTests extends TestBase {

    @Test
    @Description("Check if item is found")
    void checkIfItemFound() {
        YaMarketPage yaMarketPage = new YaMarketPage();

        open(yaMarketUrl);

        yaMarketPage.serchItem(item);
        yaMarketPage.clickResult();
        yaMarketPage.checkResult(item);
    }
}