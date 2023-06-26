package com.cydeo.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {
    @Given("user in on the page of the library application")
    public void user_in_on_the_page_of_the_library_application() {
        //TODO: FIX THIS OVER HERE
        // TODO: CHANGE THIS LOCATOR WITH SOMETHING BETTER
        System.out.println("user in on the page of the library application");
    }

    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("user enter librarian username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @Then("user  should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user  should see the dashboard");
    }

    @When("user enter student username")
    public void userEnterStudentUsername() {
        System.out.println("user enter student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("user enter admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}
