package com.applicationBehaviour;


import com.GenericMethods.WebLib;
import com.applicationor.Authentication_OR;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Authentication extends WebLib {
    Authentication_OR authentication_or;
    public Authentication(){
        this.authentication_or=PageFactory.initElements(driver, Authentication_OR.class);
    }

    public void validAuthenticationPageTitle(){
        String pageTitle=getpageTitle();
        Assert.assertEquals(true,pageTitle.startsWith("Login"));
    }

    public void checkAuthenticationHeader(){
        boolean status= checkElementExist(authentication_or.authenticationHeader,"Authentication","Authentication Header");
        Assert.assertEquals(true,status,"Authentication Header not Found");
    }


    public void validUserLogin(String userName,String password){
        enterData(authentication_or.userName,userName);
        enterData(authentication_or.password,password);
        clickElement(authentication_or.signin);
        boolean status=checkElementExist(authentication_or.athenticationError,"Authentication","Authentication Header");
        softAssert.assertEquals(true,status,"Invalid User Name:"+userName);
    }


    public void emailIdToCreateAnAccount(String emailAddress){
        enterData(authentication_or.emailaddress,emailAddress);
        clickElement(authentication_or.createAnAccount);
    }



}

