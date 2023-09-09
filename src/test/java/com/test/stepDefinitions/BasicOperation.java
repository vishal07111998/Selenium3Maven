package com.test.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AddRemovePage;
import pages.Home;
import util.DriverHelper;
import util.FileHandler;
import util.Wrapper;

import java.io.IOException;

public class SeleniumStepDefinitions {
    Home home;
    AddRemovePage addRemovePage;

    @Before
    public void setupRequiredData() throws IOException {
        FileHandler fileHandler = new FileHandler("./src/test/resources/config.properties");
        WebDriver driver = Wrapper.invokeBrowser(fileHandler.getBrowserName(), fileHandler.getBasePageUrl());
        home = new Home(driver);
        addRemovePage = new AddRemovePage(driver);
    }


    @Given("I open the Add Delete Elements")
    public void iOpenTheAddDeleteElements() {
        home.ViewAddRemoveElement();
    }

    @When("I try to add Delete Box")
    public void iTryToAddDeleteBox() {
        addRemovePage.addDeleteBox();
    }

    @Then("Delete Box Should Be Added")
    public void deleteBoxShouldBeAdded() {
        Assert.assertTrue(addRemovePage.isDeleteBoxExists());
    }

    @When("I try to remove Delete Box")
    public void iTryToRemoveDeleteBox() {
        addRemovePage.removeDeleteBox();
    }

    @Then("Delete Box Should Be Removed")
    public void deleteBoxShouldBeRemoved() {
        Assert.assertFalse(addRemovePage.isDeleteBoxExists());
    }
}

