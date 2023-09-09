package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverHelper {
    private String browserName;
    private WebDriverManager webDriverManager;

    public DriverHelper(String browserName) {
        this.browserName = browserName.toLowerCase();

    }

    public WebDriver CreateWebDriver() {
        switch (browserName) {
            case FIREFOX:
                return WebDriverManager.firefoxdriver().create();
            case SAFARI:
                return WebDriverManager.safaridriver().create();
            case EDGE:
                return WebDriverManager.edgedriver().create();
            default:
                return WebDriverManager.chromedriver().create();
        }
    }
}
