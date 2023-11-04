package Test_Steps;

import Selenium_Utility.Utility;
import org.junit.After;
import org.junit.Before;

public class Hooks extends Utility {

    @Before
    public void open_browser(){
        openBrowser();
    }

    @After
    public void close_Browser(){
        if (getDriver() != null)
            closeBrowser();

    }
}
