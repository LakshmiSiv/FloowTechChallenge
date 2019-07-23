package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepImplementations.OrientationStepImplementations;

import java.io.IOException;

public class OrientationStepDefs {

    OrientationStepImplementations implmns = new OrientationStepImplementations();

    @Given("^I'm on home screen$")
    public void i_m_on_home_screen() {
        implmns.i_m_on_home_screen();
    }

    @When("^I rotate my phone to landscape mode$")
    public void i_rotate_my_phone_to_landscape_mode() throws Exception {
        implmns.i_rotate_my_phone_to_landscape_mode();
    }

    @Then("^I shouldn't be able to use app in the landscape mode$")
    public void i_shouldn_t_be_able_to_use_app_in_the_landscape_mode() throws IOException {
        implmns.i_should_still_be_able_to_use_app();
    }
}