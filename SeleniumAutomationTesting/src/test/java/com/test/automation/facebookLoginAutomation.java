package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebookLoginAutomation {

    public static void main(String[] args) {

        //set the property(chrome driver location)
        System.setProperty("webdriver.chrome.driver", "C:\\khosipractice\\Selenium\\chromedriver_win32\\chromedriver.exe");
        //declare and instantiate webdriver
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        // Call the get() method to open the URL of the web page in the existing browser
        driver.get("http://facebook.com");
        //Find user name
        driver.findElement(By.id("email")).sendKeys("username");
        WebElement username=driver.findElement(By.id("username"));
        //find password
        driver.findElement(By.id("pass")).sendKeys("password");
        WebElement password=driver.findElement(By.id("password"));
        //button login
        driver.findElement(By.id("u_0_h_cl")).click();

    }
}
