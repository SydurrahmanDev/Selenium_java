package com.selenium.testing.locators;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.LinkedList;
import java.util.List;

public class Elements {


    public static WebDriver driver;


    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.get("https://app.hubspot.com/login");
        List<WebElement> elements =driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            // elements.get(i).sendKeys("syed");
             String text=elements.get(i).getText();
            System.out.println(text);
        }


    }


}
