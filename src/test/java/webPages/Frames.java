package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.LoggingManager;

import static util.SeleniumHelper.getText;
import static util.SeleniumHelper.switchToFrameWith;

public class Frames {
    private WebDriver driver;
    public Frames(WebDriver driver){
        this.driver=driver;
    }

    private By frameContent=By.xpath("//body");

    public void switchFrame(String frameName){
        LoggingManager.info("frameName: Switching to Frame having name "+frameName);
        if(!frameName.equalsIgnoreCase("top")){
            if(!frameName.equalsIgnoreCase("bottom")){
                LoggingManager.info("Switching To Top Frame");
                driver=switchToFrameWith(driver,"frame-top");
            }

        }

        driver=switchToFrameWith(driver,"frame-"+frameName.toLowerCase());
    }

    public String getFrameContent(){
        LoggingManager.info("getFrameContent: Getting The Data From Inside It ");
        return getText(driver,frameContent);
    }

}
