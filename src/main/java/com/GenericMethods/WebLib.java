package com.GenericMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebLib {
    public static WebDriver driver;
    public static SoftAssert softAssert=new SoftAssert();
    private static Actions actions;
    Logger logger=Logger.getLogger(WebLib.class.getName());
   public void launchBrowser() {
      WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        actions=new Actions(driver);

    }

    public String getpageTitle(){
        logger.log(Level.INFO,"Getting Page Title");
       return driver.getTitle();
    }

    public boolean checkElementExist(WebElement element,String pageName,String elementName){
        boolean status=false;
        logger.log(Level.INFO,"Finding element:"+elementName+"on the page:"+pageName);
        try{
            if(element.isDisplayed()){
                status=true;
            }

        }catch (Exception e){
            logger.log(Level.SEVERE,"Unable to Locate element:"+elementName+"on the page:"+pageName);
        }
        return status;
        }

    public  void enterData(WebElement element,String data){
       element.click();
       element.clear();
       element.sendKeys(data);
    }

    public void clickElement(WebElement element){
       actions.moveToElement(element).click(element).build().perform();
    }

    public void checkError(){
       softAssert.assertAll();
    }

//    public void enterUserDetails(){
//        File file=new File("src/main/resources/testdata.json");
//        FileReader reader=new FileReader(file);r
//    }

}