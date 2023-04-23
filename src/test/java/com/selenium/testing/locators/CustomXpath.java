package com.selenium.testing.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {


    public static WebDriver driver;

    //customxpath
    //1. //htmal[@property1='value']
   // like=//input[@id='email']
    //2. //htmal[@property1='vlaue'and @property2='value']

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.get("https://app.hubspot.com/login");
        WebElement custom=driver.findElement(By.xpath("//input[@id='username'and @type='email']"));
        custom.sendKeys("syed");







    }
}
