package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Guru99Page;

public class Guru99Step {

    @Given("^I am on the guru99 home page$")
    public void  i_am_on_the_guru99_home_page() {
    }

    @Then("^I want to go to guru99 home page$")
    public void i_want_to_go_to_guru99_home_page() {
        System.out.println("i_want_to_go_to_guru99_home_page()");
       // new Guru99Page().testClick();
    }

}
