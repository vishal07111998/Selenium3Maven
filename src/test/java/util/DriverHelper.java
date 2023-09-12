package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverHelper {
    private String browserName;


    public DriverHelper(String browserName) {
        LoggingManager.info("Creating the Driver for the browser: "+browserName);
        this.browserName = browserName.toLowerCase();
    }

    public WebDriver CreateWebDriver() {
        switch (browserName) {
            case FIREFOX:
                LoggingManager.info("CreateWebDriver: Creating The Driver For Browser Firefox");
                return WebDriverManager.firefoxdriver().create();
            case SAFARI:
                LoggingManager.info("CreateWebDriver: Creating The Driver For Browser Safari");
                return WebDriverManager.safaridriver().create();
            case EDGE:
                LoggingManager.info("CreateWebDriver: Creating The Driver For Browser Edge");
                return WebDriverManager.edgedriver().create();
            default:
                LoggingManager.info("CreateWebDriver: Creating The Driver For Browser Chrome By Default");
                return WebDriverManager.chromedriver().create();
        }
    }
}
