package com.cydeo.step_definitions;

import com.cydeo.pages.R_VYTrackDashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class R_VytrackDashboard_StepDefinitions {
    R_VYTrackDashboardPage rVyTrackDashboardPage = new R_VYTrackDashboardPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : rVyTrackDashboardPage.allTopModules) {

            actualModules.add(eachModule.getText());

        }

        Assert.assertEquals(expectedModules,actualModules);
    }

}
