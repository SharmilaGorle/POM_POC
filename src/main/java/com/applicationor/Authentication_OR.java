package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication_OR {
    @FindBy(xpath = "//h1[text()='Authentication']")
    public WebElement authenticationHeader;
    @FindBy(css ="#email")
    public WebElement userName;
    @FindBy(css = "#passwd")
    public  WebElement password;
    @FindBy(css = "#SubmitLogin")
    public  WebElement signin;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    public WebElement athenticationError;

    @FindBy(css = "#email_create")
    public WebElement emailaddress;
    @FindBy(css = "#SubmitCreate")
    public WebElement createAnAccount;

//    @FindBy(css = "#id_gender1")
//    public WebElement Title;
//
//    @FindBy(css = "#customer_firstname")
//    public WebElement customerFirstName;
//
//    @FindBy(css = "#customer_lastname")
//    public WebElement customerLastName;
//
//    @FindBy(css = "#passwd")
//    public  WebElement newPassword;
//
//    @FindBy(css = "#days")
//    public WebElement dayOfBirth;
//
//    @FindBy(css = "#months")
//    public  WebElement monthOfBirth;
//
//    @FindBy(css = "#years")
//    public WebElement yearOfBirth;


}
