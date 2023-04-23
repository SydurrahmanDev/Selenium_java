package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Signin {
   // WebDriver driver;

@Test
    public void Test2() throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver","C://software//driver//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.hubspot.com/login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //if get any wrong they will 10 sec otherwise no wait
        driver.findElement(By.id("username")).sendKeys("sydur.dev@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Laila@2018");
        driver.findElement(By.id("loginBtn")).click();

        // email.navigate()
        // driver.findElement(By.passwordid("email")).sendKeys("sydurr86@gmail.com");
        // driver.findElement(By.xpath()).click();
        // Thread.sleep(5000);
        //  driver.findElement(By.name("pass")).sendKeys("Laila2018");
        //  Thread.sleep(5000);//*[@id="topNavWrapper"]/div/div/ul/li[1]/div[1]/a
        // driver.findElement(By.name("login")).click();
        // driver.navigate().back();


    }


}
