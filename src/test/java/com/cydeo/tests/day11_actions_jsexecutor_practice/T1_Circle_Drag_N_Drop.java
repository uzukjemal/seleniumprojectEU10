package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_drop_task1(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate "Accept Cookie" button and click it
        WebElement acceptCookie = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookie.click();

        //Locate small and big circles be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("draggable"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);


    }


    //TC #: Drag and drop
    //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    //2. Drag and drop the small circle to bigger circle.
    //3. Assert:
    //-Text in big circle changed to: “You did great!”

}
