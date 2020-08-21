package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import models.Product;
import screens.DogsScreen;
import utils.HtmlTable;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DogsScreenSteps {

    @Then("Dogs screen should load")
    public void catsScreenShouldLoad() {
        DogsScreen.title.shouldBe(visible);
        DogsScreen.title.shouldHave(text("Dogs"));
    }

    @Then("Dogs screen should contain products table with following entries:")
    public void itShouldContainTheFollowingProducts(List<Product> expectedProducts) throws JsonProcessingException {
        List<Product> actualProducts = HtmlTable.toProducts(DogsScreen.productsTable);
        final ObjectMapper mapper = new ObjectMapper();

        assertThat(mapper.writeValueAsString(expectedProducts),
                is(equalTo(mapper.writeValueAsString(actualProducts))));
    }
}
