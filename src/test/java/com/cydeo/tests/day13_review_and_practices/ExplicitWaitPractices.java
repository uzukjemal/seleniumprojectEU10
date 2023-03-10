package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setupMethod(){
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get(" https://practice.cydeo.com/dynamic_controls ");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test(){


        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        /*
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

         */
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);




        //5- Verify:
        //a. Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            //assertFalse method will pass the test if the boolean value returned is: false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());

        }catch (NoSuchElementException n ){
            Assert.assertTrue(true);
        }
        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));


        Driver.closeDriver();
    }

}
