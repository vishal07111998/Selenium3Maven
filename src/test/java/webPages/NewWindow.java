package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.SeleniumHelper.*;

public class NewWindow {
    WebDriver driver;
    public NewWindow(WebDriver driver) {
        this.driver = driver;
    }
    private By newWindowButton = By.xpath("//div[@class='example']/a");
    private By newWindowElement = By.xpath("//div[@class='example']/h3");
    public void openNewWindow() {
        clickElement(driver, newWindowButton);
    }
    public String switchToNewWindow() {
        driver = switchToChildWindow(driver);
        return getText(driver, newWindowElement);
    }
    public void switchToOriginalWindow() {
        driver = switchToMainWindow(driver);
    }
    public boolean isSwitchedToOriginalWindow(WebDriver driver){
        return   isElementExists(driver,newWindowElement);
    }

}
