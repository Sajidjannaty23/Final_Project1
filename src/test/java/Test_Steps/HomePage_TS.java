package Test_Steps;

import Locators.HomePage_Locators;
import Selenium_Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HomePage_TS extends Utility {

    @And("validate page title is {string}")
    public void validate_page_title_is(String expectedTitle) {
        String actualTitle = get_Text(HomePage_Locators.HOME_PAGE_TITLE_PATH);
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        Assert.assertEquals("HomePage Title: ", expectedTitle, actualTitle);
}

    @And("validate create primary account is enabled")
    public void validate_create_primary_account_is_enabled() {
        Boolean button_Status = visibility(HomePage_Locators.CREATE_ACCOUNT).isEnabled();
        if (button_Status == true){
            System.out.println("Button is Enabled!");
        }else System.out.println("Button is Disable!");
    }
}
