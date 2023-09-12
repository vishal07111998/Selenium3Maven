package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.LoggingManager;

public class Home {
    WebDriver driver;
    WebDriverWait explicitWait;
    public Home(WebDriver driver){

        this.driver=driver;
        explicitWait=new WebDriverWait(this.driver,30);
    }
    private By AddRemoveElement=By.xpath("//a[contains(text(),'Add/Remove Elements')]");

    public void ViewAddRemoveElement(){
        LoggingManager.info("ViewAddRemoveElement: Navigating to Add/Remove Element");
        explicitWait.until(ExpectedConditions.elementToBeClickable(AddRemoveElement)).click();
    }
}
