package com.selenium.testing.locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

    WebDriver driver;

    @Test
    public void test3() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://www.nike.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // System.out.println( driver.getTitle());
        String title1 = driver.getTitle();

        String title2 = driver.getCurrentUrl();
        System.out.println(title1);
        Assertions.assertEquals("https://www.nike.com/", title2);


    }
}
