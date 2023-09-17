package com.test.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import webPages.AddRemoveBox;
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


    @Before
    public void setupRequiredData() throws IOException {
        LoggingManager.info("Setting Up Required Data and Drivers From Class: " + BasicOperation.class);
        FileHandler fileHandler = new FileHandler("./src/test/resources/config.properties");
        WebDriver driver = SeleniumHelper.invokeBrowser(fileHandler.getBrowserName(), fileHandler.getBasePageUrl());
        home = new Home(driver);
        addRemoveBox = new AddRemoveBox(driver);
        login=new Login(driver);
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
        LoggingManager.info("iTriesWithValidUsernameAndPassword: I login with User Name:"+""+" And Password: "+"");
        login.iLoginWithUserNameAndPassword("","");
    }

    @Then("I can login in secure area")
    public void iCanLoginInSecureArea() {
        LoggingManager.info("iCanLoginInSecureArea: I Can Login and See The Secure Area Message");
    }

    @When("I logout from secure area")
    public void iLogoutFromSecureArea() {

    }

    @Then("I will be on login page")
    public void iWillBeOnLoginPage() {
    }
}

