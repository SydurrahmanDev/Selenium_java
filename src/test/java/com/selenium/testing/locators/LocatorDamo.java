package com.selenium.testing.locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDamo {

   // WebDriver driver;


@Test
    public void Test1() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C://software//driver//chromedriver_win32//chromedriver.exe");
  //driver = new ChromeDriver();
     WebDriver driver=new ChromeDriver();
   // driver.get("https://facebook.com");
    driver.navigate().to("https://www.nike.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
   String title= driver.getTitle();
    System.out.println(title);
 // WebElement email= driver.findElement();(either we can use the way or regular call variable like i did)
   // email.navigate()
   // driver.findElement(By.id("email")).sendKeys("sydurr86@gmail.com");
   // driver.findElement(By.xpath()).click();
   // Thread.sleep(5000);
  //  driver.findElement(By.name("pass")).sendKeys("Laila2018");
  //  Thread.sleep(5000);//*[@id="topNavWrapper"]/div/div/ul/li[1]/div[1]/a
   // driver.findElement(By.name("login")).click();
   // driver.navigate().back();











}























}
