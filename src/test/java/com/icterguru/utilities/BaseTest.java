package com.icterguru.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
  
public class BaseTest {
  
    public WebDriver driver;
    public final static int TIMEOUT = 10;
  
    public WebDriver WebDriverManager ()  {
  
     
        if (driver == null) {
          
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
  
        }
        return driver;
    }
}