package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {

        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));
    }

    @Then("I will share my favorites")
    public void i_will_share_my_favorites(List<String> listOfPets) {
        System.out.println(listOfPets);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println(driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));

        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
       /* #1 way [I've created a method in BrowserUtil class]
       Select month = new Select(dropdownsPage.monthDropdown);
        List<WebElement> actualMonth_as_WebElement = month.getOptions();
        List<String> actualMonth_as_String = new ArrayList<>();
        for (WebElement each : actualMonth_as_WebElement) {
            actualMonth_as_String.add(each.getText());
            Assert.assertEquals(expectedMonths,actualMonth_as_String);
        }*/

        List<String> actualMonths = BrowserUtils.dropdownOptions_as_STRING(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths, actualMonths);

    }
}
