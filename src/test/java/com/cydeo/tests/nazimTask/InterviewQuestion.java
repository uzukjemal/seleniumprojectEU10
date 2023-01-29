package com.cydeo.tests.nazimTask;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InterviewQuestion {


    @Test
    public void amazon_task(){

        //1. Go to 'https://www.amazon.com.tr/'
        Driver.getDriver().get("https://www.amazon.com.tr/");

        //to accept cookies warning
        WebElement acceptCookies = Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']"));
        acceptCookies.click();

        // Search iPhone13 512
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys();

    }


}


//We expect you to automate the following steps via Selenium Web Driver, regardless of
//checking for expected/actual results. We prefer Chrome as the browser, but the choice
//is yours.
//Notes: It may also be necessary to write code  to accept cookies warning.
//1. Go to 'https://www.amazon.com.tr/'

//2. Search iPhone13 512
//3. Check that the results are listed
//4. Click iPhone13 at the top of the list
//5. Log the following values for each size
//.Size information .Price .Color .Stock status
