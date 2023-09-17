package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.LoggingManager;

import static util.SeleniumHelper.clickElement;
import static util.SeleniumHelper.isElementExists;

public class AddRemoveBox {
    WebDriver driver;

    public AddRemoveBox(WebDriver driver) {
        this.driver = driver;
    }

    private final By deleteBox = By.xpath("//button[@class='added-manually']");
    private final By addNewBox = By.xpath("//button[contains(text(),'Add Element')]");

    public void addDeleteBox() {
        LoggingManager.info("addDeleteBox: Waiting for the element to be clickable for Adding of Deletion box");
        clickElement(driver, addNewBox, 60);
    }

    public boolean isDeleteBoxExists() {
        LoggingManager.info("isDeleteBoxExists: Checking Delete box exists or not");
        return isElementExists(driver, deleteBox);
    }

    public void removeDeleteBox() {
        LoggingManager.info("removeDeleteBox: removing deletion box");
        clickElement(driver, deleteBox);
    }
}
