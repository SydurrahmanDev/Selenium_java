package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;

public class ActionDemo {
 WebDriver driver;

@Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://www.costco.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement deals= driver.findElement(By.id("navigation-dropdown"));
        Thread.sleep(5000);
        Actions action= new Actions(driver);
        action.clickAndHold().build().perform();


    }




}
