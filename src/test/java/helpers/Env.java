package helpers;

public class Env {

    public final static String
            isHeadless = System.getProperty("isHeadless", "true"),
// Facebook
            url = System.getProperty("url", "http://facebook.com"),
            myMail = System.getProperty("myMail", "ironweed@list.ru"),
            email = System.getProperty("email", "qa.guru.test@gmail.com"),
            password = System.getProperty("password", "testpassword#&!"),
            myPassword = System.getProperty("myPassword"),
// Yandex
            yaUrl = System.getProperty("url", "https://yandex.ru"),
// YandexMarket
            yaMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru"),
            item = System.getProperty("searchItem", "Xiaomi Redmi Note 7"),
// Lepra
            lepraUrl = System.getProperty("lepraUrl", "https://leprosorium.ru"),
            lepraUsername = System.getProperty("leproname", "General_Pferd"),
            lepraPassword = System.getProperty("lepropass");
}