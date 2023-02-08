package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {

    @Test
    public void dynamic_load_7_test(){

        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7 ");

        //2. Wait until title is “Dynamic title”

        //creating the wait object to be able to create certain condition to wait
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


        //use the "wait" object to create our expected condition
        //wait.until(ExpectedConditions.titleIs("Dynamic title"));


        //Create object of DynamicLoad7Page to reach and assert web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
    }


    @Test
    public void dynamically_loaded_page_elements(){

        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start

        //3. Wait until loading bar disappears
        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        //6. Enter password: incorrectpassword
        //7. Click to Submit button
        //8. Assert “Your password is invalid!” text is displayed.

    }
}
