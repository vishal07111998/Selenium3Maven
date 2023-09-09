package util;

import org.openqa.selenium.WebDriver;

public class Wrapper {

    public static WebDriver invokeBrowser(String browserName, String baseUrl) {
        DriverHelper driverHelper = new DriverHelper(browserName);
        WebDriver driver = driverHelper.CreateWebDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        return driver;
    }

}
