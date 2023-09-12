package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.LoggingManager;

public class AddRemovePage {
    WebDriver driver;
    WebDriverWait explicitWait;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
        explicitWait = new WebDriverWait(this.driver, 30);
    }

    private By deleteBox = By.xpath("//button[@class='added-manually']");
    private By addNewBox=By.xpath("//button[contains(text(),'Add Element')]");

    public void addDeleteBox()  {
        LoggingManager.info("addDeleteBox: Waiting for the element to be clickable for Adding of Deletion box");
        explicitWait.until(ExpectedConditions.elementToBeClickable(addNewBox)).click();
    }
    public boolean isDeleteBoxExists() {
        LoggingManager.info("isDeleteBoxExists: Checking Delete box exists or not");
        try {
            explicitWait.until(ExpectedConditions.elementToBeClickable(deleteBox));
            return true;
        } catch (TimeoutException exception) {
            return false;
        }
    }

    public void removeDeleteBox()  {

        LoggingManager.info("removeDeleteBox: removing deletion box");
        explicitWait.until(ExpectedConditions.elementToBeClickable(deleteBox)).click();
    }
}
