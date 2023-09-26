package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.LoggingManager;

import static util.SeleniumHelper.clickElement;

public class Home {
    WebDriver driver;
    public Home(WebDriver driver) {
        this.driver = driver;
    }
    private final By AddRemoveElement = By.xpath("//a[contains(text(),'Add/Remove Elements')]");
    private final By loginElement = By.xpath("//a[contains(text(),'Form Authentication')]");
    private final By checkboxElement = By.xpath("//a[contains(text(),'Checkboxes')]");
    private final By multipleWindowElement=By.xpath("//a[contains(text(),'Multiple Windows')]");
    private final By nestedFramesElement=By.xpath("//a[contains(text(),'Nested Frames')]");
    public void viewAddRemoveElementPage() {
        LoggingManager.info("ViewAddRemoveElementPage: Navigating to Add/Remove Element Page");
        clickElement(driver, AddRemoveElement);
    }
    public void viewLoginPage() {
        LoggingManager.info("ViewAddRemoveElementPage: Navigation to user login Page");
        clickElement(driver, loginElement);
    }
    public void viewCheckpointPage() {
        LoggingManager.info("viewCheckpointPage: Navigating To Checkpoint Page");
        clickElement(driver, checkboxElement);
    }
    public void openNewWindow() {
        LoggingManager.info("openNewWindow: Navigating To New Window Page");
        clickElement(driver,multipleWindowElement);
    }
    public void openNestedFrames(){
        LoggingManager.info("openNestedFrames: Navigating To nested Frames Page");
        clickElement(driver,nestedFramesElement);
    }
}