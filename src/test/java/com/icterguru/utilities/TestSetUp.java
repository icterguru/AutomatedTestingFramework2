package com.icterguru.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.icterguru.page_objects.PageObjectManager;
  
public class TestSetUp {
  
    public WebElement errorMessage;
    public WebElement homePageUserName;
    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
  
    public TestSetUp()  {
  
        baseTest = new BaseTest();
        pageObjectManager = new PageObjectManager(baseTest.WebDriverManager());
  
    }
}