package com.test.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AddRemovePage;
import pages.Home;
import util.FileHandler;
import util.LoggingManager;
import util.Wrapper;

import java.io.IOException;

public class BasicOperation {
    Home home;
    AddRemovePage addRemovePage;


    @Before
    public void setupRequiredData() throws IOException {
        LoggingManager.info("Setting Up Required Data and Drivers From Class: " + BasicOperation.class);
        FileHandler fileHandler = new FileHandler("./src/test/resources/config.properties");
        WebDriver driver = Wrapper.invokeBrowser(fileHandler.getBrowserName(), fileHandler.getBasePageUrl());
        home = new Home(driver);
        addRemovePage = new AddRemovePage(driver);
    }


    @Given("I open the Add Delete Elements")
    public void iOpenTheAddDeleteElements() {
        LoggingManager.info("iOpenTheAddDeleteElements: View The Add/Remove Element On Site");
        home.ViewAddRemoveElement();
    }

    @When("I try to add Delete Box")
    public void iTryToAddDeleteBox() {
        LoggingManager.info("iTryToAddDeleteBox: Adding The Delete Box");
        addRemovePage.addDeleteBox();
    }

    @Then("Delete Box Should Be Added")
    public void deleteBoxShouldBeAdded() {
        LoggingManager.info("deleteBoxShouldBeAdded: Verifying that the delete box is added");
        Assert.assertTrue(addRemovePage.isDeleteBoxExists());
    }

    @When("I try to remove Delete Box")
    public void iTryToRemoveDeleteBox() {
        LoggingManager.info("iTryToRemoveDeleteBox: removing the delete box");
        addRemovePage.removeDeleteBox();
    }

    @Then("Delete Box Should Be Removed")
    public void deleteBoxShouldBeRemoved() {
        LoggingManager.info("deleteBoxShouldBeRemoved: Verifying the delete box is removed");
        Assert.assertFalse(addRemovePage.isDeleteBoxExists());
    }
}

