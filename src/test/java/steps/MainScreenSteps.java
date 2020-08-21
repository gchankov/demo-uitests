package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import screens.MainScreen;

public class MainScreenSteps {

    @Given("the user is on Main page")
    public void theUserIsOnMainPage() {
        MainScreen.open();
    }
}
