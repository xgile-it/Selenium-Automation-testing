package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumAutomation {

    public static void main(String[] args){

        //set the property(chrome driver location)
        System.setProperty("webdriver.chrome.driver","C:\\khosipractice\\Selenium\\chromedriver_win32\\chromedriver.exe");
        //declare and instantiate webdriver
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        // Call the get() method to open the URL of the web page in the existing browser
        driver.get("http://facebook.com");
        // Wait For Page To Load.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        //close the web
        driver.quit();

    }
}
