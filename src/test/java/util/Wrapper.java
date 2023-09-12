package util;

import org.openqa.selenium.WebDriver;

public class Wrapper {

    public static WebDriver invokeBrowser(String browserName, String baseUrl) {
        LoggingManager.info("invokeBrowser: invoking the browser "+browserName+" with URL "+baseUrl);
        DriverHelper driverHelper = new DriverHelper(browserName);
        WebDriver driver = driverHelper.CreateWebDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        return driver;
    }

}
