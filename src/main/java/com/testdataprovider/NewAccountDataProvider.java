package com.testdataprovider;

import org.testng.annotations.DataProvider;

public class NewAccountDataProvider {
    @DataProvider(name = "New Email Id")
    public Object[][] getEmailId(){
        Object[][] newEmailId=new Object[1][1];
        newEmailId[0][0]="anand123456@gmail.com";


    return newEmailId;

    }
}
