package com.cydeo.step_definitions;

import com.cydeo.pages.VYTrackPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VYTrack_Login_StepDefinitions {

    VYTrackPage vyTrackPage = new VYTrackPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://app.vytrack.com/user/login");
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {

        vyTrackPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        

        //BrowserUtils.waitFor(3);

        Assert.assertEquals("login error", expectedTitle, actualTitle);

    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        vyTrackPage.login(ConfigurationReader.getProperty("salesmanager_username"),
                ConfigurationReader.getProperty("salesmanager_password"));
    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vyTrackPage.login(ConfigurationReader.getProperty("storemanager_username"),
                ConfigurationReader.getProperty("storemanager_password"));
    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {

        vyTrackPage.loginDynamic(userType);

    }
}
