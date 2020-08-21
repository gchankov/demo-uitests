package screens;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainScreen {

    public static void open() {
        Selenide.open("https://petstore.octoperf.com/actions/Catalog.action");
    }
}
