package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_T5_Facebook2 {

    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement usernameInput = driver.findElement(By.className("inputtext _55r1 _6luy"));
        usernameInput.sendKeys("incorrect username");

        //4. Enter incorrect password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("incorrect password");

        //5. Verify title changed to:
        //Expected: “Log into Facebook”


    }
}
