package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CatsScreen {

    public static SelenideElement title = $("#Catalog > h2");
    public static SelenideElement productsTable = $("#Catalog > table");
}
