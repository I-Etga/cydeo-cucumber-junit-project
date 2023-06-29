package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Wikipedia_StepDefinitions {
    WikipediaPage wikipediaPage = new WikipediaPage();

    @When("user is on Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

        //in German version of Wikipedia no image header.
        // [Because of my ip,it navigates me directly to the german version]
        //So I change first the language and then test it !!

        Select select = new Select(wikipediaPage.language);
        select.selectByVisibleText("English");
    }

    @Then("user should see title is Wikipedia")
    public void user_should_see_title_is_wikipedia() {


        BrowserUtils.verifyTitle("Wikipedia");
    }


    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {

        wikipediaPage.searchBox.sendKeys("Steve Jobs");

    }

    @And("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.submitButton.click();
    }

    @When("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        BrowserUtils.verifyTitle("Steve Jobs – Wikipedia");
    }

    @Then("user sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {

        Assert.assertEquals(wikipediaPage.header.getText(), "Steve Jobs");

    }

    @Then("user sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertTrue(wikipediaPage.imgHeader.isDisplayed());
    }
}
