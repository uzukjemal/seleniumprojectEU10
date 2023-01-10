package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {


    public WebDriver driver;
    @BeforeMethod
    public void setupMethod () {
        //1. Create new test and make set up
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://google.com
        driver.get("https://google.com");
    }


    @Test
    public void google_search_test(){

        //3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);


        //Expected: apple - Google Search
        //4- Verify title:
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);





    }



}
