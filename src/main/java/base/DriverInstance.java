package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Utility;

import java.io.IOException;

public class DriverInstance {

    WebDriver driver;

    @BeforeMethod
    public void initiateDriver() throws IOException {

        //Read data from the config file
        if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/aliciavalladares/Documents/Workspace/Drivers/chromedriver");
            driver = new ChromeDriver();
            System.out.println("chrome");
        }
        else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
         else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        }
         else {
            driver = new ChromeDriver();
        }
        driver.get(Utility.fetchPropertyValue("applicationURL").toString());
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
