package Selenium_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseSetup {
    WebDriver driver;

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
    }

    public void closeBrowser(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
