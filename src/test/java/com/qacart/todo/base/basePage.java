package com.qacart.todo.base;

import org.openqa.selenium.WebDriver;

public class basePage {
    protected WebDriver driver;

    public basePage(WebDriver driver){
        this.driver = driver;
    }

    public void load(String url){
        driver.get(url);
    }

}
