package util;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
    static int waitTimeInSeconds = 30;

    public static WebDriver invokeBrowser(String browserName, String baseUrl) {
        LoggingManager.info("invokeBrowser: invoking the browser " + browserName + " with URL " + baseUrl);
        DriverHelper driverHelper = new DriverHelper(browserName);
        WebDriver driver = driverHelper.CreateWebDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        return driver;
    }


    public static void clickElement(WebDriver driver, By element, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void clickElement(WebDriver driver, By element) {

        WebDriverWait wait = new WebDriverWait(driver, waitTimeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static boolean isElementExists(WebDriver driver, By element, int timeout) {
        WebDriverWait explicitWait = new WebDriverWait(driver, timeout);
        try {
            explicitWait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (TimeoutException timeoutException) {
            return false;
        }
    }

    public static boolean isElementExists(WebDriver driver, By element) {
        WebDriverWait explicitWait = new WebDriverWait(driver, waitTimeInSeconds);
        try {
            explicitWait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (TimeoutException timeoutException) {
            return false;
        }
    }

    public static void enterText(WebDriver driver, By element, String text, int timeout) {
        WebDriverWait explicitWait = new WebDriverWait(driver, timeout);
        explicitWait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }

    public static Boolean isCheckboxSelected(WebDriver driver, By element) {
        return driver.findElement(element).isSelected();
    }
}
