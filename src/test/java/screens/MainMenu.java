package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainMenu {

    public static SelenideElement catsButton = $("#SidebarContent > a:nth-child(7)");
    public static SelenideElement dogsButton = $("#SidebarContent > a:nth-child(4)");
}
