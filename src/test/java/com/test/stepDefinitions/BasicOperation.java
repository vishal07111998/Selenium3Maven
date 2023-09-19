package com.test.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import webPages.AddRemoveBox;
import webPages.Checkbox;
import webPages.Home;
import util.FileHandler;
import util.LoggingManager;
import util.SeleniumHelper;
import webPages.Login;

import java.io.IOException;

public class BasicOperation {
    Home home;
    AddRemoveBox addRemoveBox;
    Login login;
    WebDriver driver;
    Checkbox checkbox;


    @Before
    public void setupRequiredData() throws IOException {
        LoggingManager.info("Setting Up Required Data and Drivers From Class: " + BasicOperation.class);
        FileHandler fileHandler = new FileHandler("./src/test/resources/config.properties");
        driver = SeleniumHelper.invokeBrowser(fileHandler.getBrowserName(), fileHandler.getBasePageUrl());
        home = new Home(driver);
        addRemoveBox = new AddRemoveBox(driver);
        login = new Login(driver);
        checkbox = new Checkbox(driver);
    }


    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    @Given("I open the Add Delete Elements")
    public void iOpenTheAddDeleteElements() {
        LoggingManager.info("iOpenTheAddDeleteElements: View The Add/Remove Element On Site");
        home.viewAddRemoveElementPage();
    }

    @When("I try to add Delete Box")
    public void iTryToAddDeleteBox() {
        LoggingManager.info("iTryToAddDeleteBox: Adding The Delete Box");
        addRemoveBox.addDeleteBox();
    }

    @Then("Delete Box Should Be Added")
    public void deleteBoxShouldBeAdded() {
        LoggingManager.info("deleteBoxShouldBeAdded: Verifying that the delete box is added");
        Assert.assertTrue(addRemoveBox.isDeleteBoxExists());
    }

    @When("I try to remove Delete Box")
    public void iTryToRemoveDeleteBox() {
        LoggingManager.info("iTryToRemoveDeleteBox: removing the delete box");
        addRemoveBox.removeDeleteBox();
    }

    @Then("Delete Box Should Be Removed")
    public void deleteBoxShouldBeRemoved() {
        LoggingManager.info("deleteBoxShouldBeRemoved: Verifying the delete box is removed");
        Assert.assertFalse(addRemoveBox.isDeleteBoxExists());
    }

    @Given("I open the login page")
    public void iOpenTheLoginPage() {
        LoggingManager.info("iOpenTheLoginPage: Opening The User Login Page");
        home.viewLoginPage();
    }

    @When("I tries with valid username and password")
    public void iTriesWithValidUsernameAndPassword() {
        LoggingManager.info("iTriesWithValidUsernameAndPassword: I login with User Name:" + "" + " And Password: " + "");
        login.iLoginWithUserNameAndPassword("tomsmith", "SuperSecretPassword!");
    }

    @Then("I can login in secure area")
    public void iCanLoginInSecureArea() {
        LoggingManager.info("iCanLoginInSecureArea: I Can Login and See The Secure Area Message");
        Assert.assertTrue(login.amILoggedIn());
    }

    @When("I logout from secure area")
    public void iLogoutFromSecureArea() {
        LoggingManager.info("iLogoutFromSecureArea: Logging Out From Secure Area");
        login.logoutFromSecureArea();
    }

    @Then("I will be on login page")
    public void iWillBeOnLoginPage() {
        LoggingManager.info("iWillBeOnLoginPage: verifying user is on login page");
        Assert.assertTrue(login.isUserLogout());
    }

    @Given("I open the checkbox Page")
    public void iOpenTheCheckboxPage() {
        LoggingManager.info("iOpenTheCheckboxPage: Opening The Checkbox Page");
        home.viewCheckpointPage();
    }

    @When("I select the checkbox")
    public void iSelectTheCheckbox() {
        LoggingManager.info("iSelectTheCheckbox: Selecting the First CheckBox");
        checkbox.selectCheckBoxOne();
    }

    @Then("Checkbox should be selected")
    public void checkboxShouldBeSelected() {
        LoggingManager.info("checkboxShouldBeSelected: CheckBox First Should Be Checked");
        Assert.assertTrue(checkbox.isCheckBoxFirstSelected());
    }

    @When("I unselect the checkbox")
    public void iUnselectTheCheckbox() {
        LoggingManager.info("iUnselectTheCheckbox: I Unselect the checkbox First");
        checkbox.selectCheckBoxOne();
    }

    @Then("checkbox should be unselected")
    public void checkboxShouldBeUnselected() {
        LoggingManager.info("checkboxShouldBeUnselected: CheckBox Should Be Unselected");
        Assert.assertFalse(checkbox.isCheckBoxFirstSelected());
    }
}

