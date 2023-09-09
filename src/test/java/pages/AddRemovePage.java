package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemovePage {
    WebDriver driver;
    WebDriverWait explicitWait;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
        explicitWait = new WebDriverWait(this.driver, 30);
    }

    private By deleteBox = By.xpath("//button[@class='added-manually']");
    private By addNewBox=By.xpath("//button[contains(text(),'Add Element')]");

    public void addDeleteBox(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(addNewBox)).click();
    }
    public boolean isDeleteBoxExists() {
        try {
            explicitWait.until(ExpectedConditions.elementToBeClickable(deleteBox));
            return true;
        } catch (TimeoutException exception) {
            return false;
        }
    }

    public void removeDeleteBox(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(deleteBox)).click();
    }
}
