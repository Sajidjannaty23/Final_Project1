package Selenium_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends BaseSetup{
    public WebDriverWait explicitlyWait(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return wait;
    }

    public WebElement visibility(By locator){
        return explicitlyWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String get_Text(By locator){
        return visibility(locator).getText();
    }
}
