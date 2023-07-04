package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_StepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("user is on the Etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
        etsySearchPage.acceptAllCookies.click();

    }

    @Then("user sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.";

        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");

    }

    @When("user click on to Etsy search button")
    public void user_click_on_to_etsy_search_button() {
        etsySearchPage.searchButton.click();

    }

    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitle("Wooden spoon - Etsy DE");
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {
        etsySearchPage.searchButton.sendKeys(keyword);

    }

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}
