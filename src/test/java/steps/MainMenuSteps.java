package steps;

import io.cucumber.java.en.When;
import screens.MainMenu;
import screens.MainScreen;

public class MainMenuSteps {

    @When("the user clicks on Cats button under Main Menu")
    public void theUserClicksOnCatsButton() {
        MainMenu.catsButton.click();
    }

    @When("the user clicks on Dogs button under Main Menu")
    public void theUserClicksOnDogButton() {
        MainMenu.dogsButton.click();
    }
}
