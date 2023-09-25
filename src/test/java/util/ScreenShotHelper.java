package util;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotHelper {
    public static byte[] captureScreenShot(WebDriver driver) {
        LoggingManager.info("Capturing The ScreenShot for the tests");
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }

}
