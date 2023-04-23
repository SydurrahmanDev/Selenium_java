package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitDemo {
    // 2 types of wait
    //1 .static wait -thread
    //2. dynamic wait(2 kind)
    //1 implicit-gobal use
    //2.explicit- just individual use
    WebDriver driver;

    @Test
    public void test3() throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver", "C://software//driver//chromedriver_win32//chromedriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.nike.com/");
        driver.manage().window().maximize();
        // Thread.sleep(500);
        By username = By.id("hf_header_label_help");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(username)).click();


    }


}
