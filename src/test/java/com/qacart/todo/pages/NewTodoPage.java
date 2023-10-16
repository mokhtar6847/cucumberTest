package com.qacart.todo.pages;

import com.qacart.todo.base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage extends basePage {

    private WebDriver driver;

    public NewTodoPage(WebDriver driver) {
        super(driver);
    }


    private final By TodoInput = By.cssSelector("[data-testid=\"new-todo\"]");
    private final By NewToDoSubmit = By.cssSelector("[data-testid=\"submit-newTask\"]");
}
