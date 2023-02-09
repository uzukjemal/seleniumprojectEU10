package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy
    public void

}
