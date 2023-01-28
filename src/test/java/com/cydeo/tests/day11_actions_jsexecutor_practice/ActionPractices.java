package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_task(){

        Driver.getDriver().get("https://practice.cydeo.com/");
        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: ""
        //3- Scroll down to “Powered by CYDEO”
        //4- Scroll using Actions class “moveTo(element)” method

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button

    }


}
