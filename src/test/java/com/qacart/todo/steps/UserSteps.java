package com.qacart.todo.steps;

import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UserSteps {

    WebDriver driver;

    @Given("user is at login page")
    public void userIsAtLoginPage() {
        driver = DriverFactory.getDriver();


    }

    @When("user fills the email and password and login")
    public void userFillsTheEmailAndPasswordAndLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load("https://todo.qacart.com/");
        loginPage.login("hatem@example.com", "Test1234");

    }

    @Then("Welcome message should be displayed")
    public void WelcomeMessageShouldBeDisplayed() {

    }
}
