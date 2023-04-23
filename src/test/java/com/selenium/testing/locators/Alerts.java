package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
    WebDriver driver;

    @Test
    public void test3() throws InterruptedException {
        //   System.setProperty("webdriver.chrome.driver", "C://software//driver//chromedriver_win32//chromedriver.exe");

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Thread.sleep(5000);
        Alert alerts = driver.switchTo().alert();
        String text = alerts.getText();
        System.out.println(text);
        alerts.sendKeys("good morning");
        Thread.sleep(5000);
        alerts.accept();


    }
}