package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
//select by
    //1.index wise
    //2.visible wise
    //3.value




    WebDriver driver;

    @Test
    public void test3() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.name("FullName")).sendKeys("sydur rahman");
        Thread.sleep(5000);
        driver.findElement(By.name("Email")).sendKeys("sydurr86@gmail.com");
        Thread.sleep(5000);
        By country= By.name("Country");
        Select select=new Select(driver.findElement(country));
        Thread.sleep(5000);
        select.selectByValue("Bangladesh");









    }
}