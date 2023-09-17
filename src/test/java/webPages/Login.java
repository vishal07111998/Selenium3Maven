package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.SeleniumHelper.clickElement;
import static util.SeleniumHelper.enterText;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private final By userName= By.id("username");
    private final By password=By.id("password");

    private final By loginButton=By.xpath("//button[@class='radius']");

    private final By secureMessage

    public void iLoginWithUserNameAndPassword(String userName, String password){
        enterText(driver,this.userName,userName,60);
        enterText(driver,this.password,password,60);
        clickElement(driver,loginButton,60);
    }
}
