package com.applicationBehaviour;

import com.GenericMethods.WebLib;
import com.applicationor.Homepage_OR;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebLib{
Homepage_OR homepage_or;
public HomePage(){

    this.homepage_or=PageFactory.initElements(driver,Homepage_OR.class);
}
@Step("Clicking on Signin link on home page")
public void clickSignIN(){
    homepage_or.signin.click();
}

}
