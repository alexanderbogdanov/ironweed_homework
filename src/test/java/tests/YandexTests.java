package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.YandexPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Env.*;


@Epic("QA.GURU automation course")
@Story("Yandex tests")
@Tag("yandex")

public class YandexTests extends TestBase {

    @Test
    @Description("Positive Search Test With PageObject")
    void SearchTest() {
        YandexPage yandexPage = new YandexPage();
        open(yaUrl);
        yandexPage.searchInput(YandexPage.query);
        yandexPage.verifyResultFound(YandexPage.searchResult);
    }
}
