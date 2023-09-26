package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.SeleniumHelper.*;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver) {
        this.driver = driver;
    }
    private final By userName = By.id("username");
    private final By password = By.id("password");
    private final By loginButton = By.xpath("//button[@class='radius']");
    private final By secureMessage = By.xpath("//h2[contains(text(),' Secure Area')]");
    private final By logoutButton= By.xpath("//i[contains(text(),' Logout')]");
    private final By loginHeading=By.xpath("//h2[contains(text(),'Login Page')]");
    public void iLoginWithUserNameAndPassword(String userName, String password) {
        enterText(driver, this.userName, userName, 60);
        enterText(driver, this.password, password, 60);
        clickElement(driver, loginButton, 60);
    }
    public boolean amILoggedIn() {
        return isElementExists(driver, secureMessage);
    }
    public void logoutFromSecureArea(){
        clickElement(driver,logoutButton);
    }
    public boolean isUserLogout(){
        return isElementExists(driver,loginHeading);
    }

}
