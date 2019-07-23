package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepImplementations.NavigationStepImplementations;

import java.io.IOException;

public class NavigationstepDefs {

NavigationStepImplementations implementations = new NavigationStepImplementations();




    @When("^I choose journeys option$")
    public void i_choose_journeys_option()  {
        implementations.i_choose_journeys_option();
    }

    @Then("^I should see recorded data$")
    public void i_should_see_recorded_data()  {
        implementations.i_should_see_recorded_data();
    }

    @Given("^I'm on Journeys screen$")
    public void i_m_on_Journeys_screen() throws Throwable {
        implementations.i_m_on_Journeys_screen();
    }

    @When("^I get the existing record$")
    public void i_get_the_existing_record()  {
        implementations.i_get_the_existing_record();
    }

    @When("^I unistall the app$")
    public void i_unistall_the_app()  {
        implementations.i_unistall_the_app();
    }

    @When("^I re-install the app$")
    public void i_re_install_the_app() throws Exception  {
        implementations.i_re_install_the_app();
    }

    @When("^I provide the valid username$")
    public void i_provide_the_valid_username() throws Exception {
        implementations.i_enter_valid_username();
    }

    @When("^I provide the valid password$")
    public void i_provide_the_valid_password() throws Exception  {
        implementations.i_enter_password();
    }

    @When("^I navigate to the journeys screen$")
    public void i_navigate_to_the_journeys_screen() {
        implementations.i_navigate_to_the_journeys_screen();
    }

    @Then("^I should see the previously recorded data$")
    public void i_should_see_the_previously_recorded_data() {
        implementations.i_should_see_the_previously_recorded_data();
    }
}
