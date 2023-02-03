package com.cydeo.tests.nazimTask;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InterviewQuestion {


    @Test
    public void amazon_task(){

        //1. Go to 'https://www.amazon.com.tr/'
        Driver.getDriver().get("https://www.amazon.com.tr/");

        //2. to accept cookies warning
        WebElement acceptCookies = Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']"));
        acceptCookies.click();

        //3. Search iPhone13 512
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone13 512"+ Keys.ENTER);


        //4. Check that the results are listed, checking for expected/actual results
        String expectedResult = "Amazon.com.tr : iPhone13 512";
        String actualResult = Driver.getDriver().getTitle();

        Assert.assertEquals(actualResult, expectedResult, "Actual result text is not as expected!!!");

        //5. Click iPhone13 at the top of the list
        WebElement clickIphone13AtTheTop = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        clickIphone13AtTheTop.click();


        //6. Size information .Price .Color .Stock status
        WebElement itemSize = Driver.getDriver().findElement(By.xpath("(//div/p[@class='a-text-left a-size-base'])[3]"));
        WebElement itemPrice = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement itemColor = Driver.getDriver().findElement(By.xpath("//span[@class='selection']"));
        WebElement itemStockStatus = Driver.getDriver().findElement(By.xpath("//div/span[@class='a-size-medium a-color-success']"));


        System.out.println("iPhone 13  Size:"+itemSize.getText());
        System.out.println("Color:"+ itemColor.getText()+ " " + " Price:"+itemPrice.getText());
        System.out.println("Stock:"+ itemStockStatus.getText());



        Driver.closeDriver();
    }


}


//We expect you to automate the following steps via Selenium Web Driver.
//We prefer Chrome as the browser, but the choice is yours.
//5. Log the following values for each size

