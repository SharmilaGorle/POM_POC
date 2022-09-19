package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount_OR {
    @FindBy(css = "#id_gender1")
    public WebElement Title;

    @FindBy(css = "#customer_firstname")
    public WebElement customerFirstName;

    @FindBy(css = "#customer_lastname")
    public WebElement customerLastName;

    @FindBy(css = "#passwd")
    public  WebElement newPassword;

    @FindBy(css = "#days")
    public WebElement dayOfBirth;

    @FindBy(css = "#months")
    public  WebElement monthOfBirth;

    @FindBy(css = "#years")
    public WebElement yearOfBirth;

}
