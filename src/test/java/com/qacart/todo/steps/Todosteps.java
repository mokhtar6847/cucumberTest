package com.qacart.todo.steps;

import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Todosteps {
    WebDriver driver;

    @Given("user is at the todos page")
    public void userisatthetodospage() {
        driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load("https://todo.qacart.com/");
        loginPage.login("hatem@example.com", "Test1234");

    }

    @When("add a new to do")
    public void addanewtodo() {

        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Cucumber");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();


    }

    @Then("todo should be added correctly")
    public void todoshouldbeaddedcorrectly() {
        String text = driver.findElements(By.cssSelector("[data-testid=\"todo-item\"]")).get(0).getText();
        Assert.assertEquals(text, "Learn Cucumber");

    }
}
