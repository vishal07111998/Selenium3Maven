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

    private final By loginElement=By.xpath("//a[contains(text(),'Form Authentication')]");



    public void viewAddRemoveElementPage() {
        LoggingManager.info("ViewAddRemoveElementPage: Navigating to Add/Remove Element Page");
        clickElement(driver, AddRemoveElement);
    }
    public void viewLoginPage(){
        LoggingManager.info("ViewAddRemoveElementPage: Navigation to user login Page");
        clickElement(driver,loginElement);
    }
}
