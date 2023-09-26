package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.SeleniumHelper.clickElement;
import static util.SeleniumHelper.isCheckboxSelected;

public class Checkbox {
    WebDriver driver;
    public Checkbox(WebDriver driver) {
        this.driver = driver;
    }
    private By checkBoxFirst = By.xpath("(//form[@id='checkboxes']/input)[1]");
    public void selectCheckBoxOne() {
        clickElement(driver, checkBoxFirst);
    }
    public boolean isCheckBoxFirstSelected() {
        return isCheckboxSelected(driver, checkBoxFirst);
    }
}