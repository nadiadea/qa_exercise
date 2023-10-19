package login.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    WebDriver driver;

    @Given("I open the Saucedemo website")
    public void i_open_the_saucedemo_website() {
        // Code to open the website
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Code to enter valid credentials
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        // Code to enter invalid credentials
    }

    @When("I click the Login button")
    public void i_click_the_login_button() {
        // Code to click the Login button
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Code to verify successful login
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        // Code to verify the presence of an error message
    }
}
