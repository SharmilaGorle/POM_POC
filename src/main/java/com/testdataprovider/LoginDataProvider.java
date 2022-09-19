package com.testdataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "invalid")
    public Object[][] getUserDetails(){
        Object[][] userDetails= new Object[3][2];
        userDetails[0][0]="abc@gmail.com";
        userDetails[0][1]="pwd123";

        userDetails[1][0]="def@gmail.com";
        userDetails[1][1]="pwd456";

        userDetails[2][0]="ghi@gmail.com";
        userDetails[2][1]="pwd789";

        return userDetails;
    }
}
