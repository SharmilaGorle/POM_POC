package com.testcases;


import com.annotations.TestAnnotations;
import com.applicationBehaviour.Authentication;
import com.applicationBehaviour.HomePage;
import com.testdataprovider.LoginDataProvider;
import com.testdataprovider.NewAccountDataProvider;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TC_01 extends TestAnnotations {

 @Test(testName = " Navigate to Authentication Page", priority = 1)
 @Story("US-03")
 @Feature("User Registration")
 @Severity(SeverityLevel.CRITICAL)
  public void userLogin(){
     HomePage homePage=new HomePage();
     homePage.clickSignIN();
     Authentication authentication=new Authentication();
     authentication.validAuthenticationPageTitle();
     authentication.checkAuthenticationHeader();

 }
 @Test(dataProviderClass = LoginDataProvider.class,dataProvider = "invalid",priority = 2,dependsOnMethods = "userLogin")
    public void validateUserCredentials(String userName,String password){
     System.out.println(userName+"---"+password);
     Authentication authentication=new Authentication();
     authentication.validUserLogin(userName,password);
 }

 @Test(dataProviderClass = NewAccountDataProvider.class,dataProvider = "New Email Id",priority = 3)
    public void validateEmailId(String emailAddress){
     System.out.println(emailAddress);
     Authentication authentication=new Authentication();
     authentication.emailIdToCreateAnAccount(emailAddress);


 }
}
