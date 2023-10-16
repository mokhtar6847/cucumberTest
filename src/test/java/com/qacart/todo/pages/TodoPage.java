package com.qacart.todo.pages;

import com.qacart.todo.base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends basePage {

    private WebDriver driver;

    public TodoPage(WebDriver driver) {
        super(driver);
    }

    private final By plusbutton = By.cssSelector("[data-testid=\"add\"]");
    private final By ItemText = By.cssSelector("[data-testid=\"todo-item\"]");
}
