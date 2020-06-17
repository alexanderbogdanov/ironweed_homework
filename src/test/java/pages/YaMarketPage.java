package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Env.item;

public class YaMarketPage {
    SelenideElement queryInput = $(by("name", "text")),
            searchResult = $x("(//div[@data-zone-name='snippetList'])[1]");

    public static String firstSearchResult = "div._38V6fgYMij > div > div:nth-child(1)";

    @Step("Search for {item}")
    public void serchItem(String item)
    {
        queryInput.setValue(item).pressEnter();
    }

    @Step("Click first {searchResult}")
    public void clickResult()
    {
        $(searchResult).click();
    }

    @Step("Check {searchResult}")
    public void checkResult(String item) {
        switchTo().window(1);
        $(byTagName("h1")).shouldHave(text(item));
    }
}
