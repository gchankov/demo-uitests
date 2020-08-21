package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.TestData;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Hooks {

    @Before
    public void beforeScenario() {
        Configuration.timeout = 20000L;
        Configuration.browserSize = "1680x1050";
        Configuration.screenshots = false;

        TestData.reset();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String filename = System.currentTimeMillis() + "_" + scenario.getLine();
            String screenshotPath = Selenide.screenshot(filename);
            File screenshotFile = new File(screenshotPath);
            scenario.embed(Files.readAllBytes(screenshotFile.toPath()), "image/png");
        }

        Selenide.close();
    }
}
