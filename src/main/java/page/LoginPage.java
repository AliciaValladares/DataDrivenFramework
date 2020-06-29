package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    //Create a constructor to pass the driver object
    public LoginPage(WebDriver driver) {
       this.driver=driver;
    }

    //Create a method for each activity
    public void enterUsername(String username) throws IOException {
        System.out.println("Método username");
        driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(username);
        System.out.println("Despues Método username");
    }

    public void enterPassword(String password) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(password);
    }

    public void submit() throws IOException {
        System.out.println("Método click");
        driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signingButton_xpath"))).click();
        System.out.println("Despues click");
    }

    public void enterFirstName(String firstName) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_firstName_name"))).sendKeys(firstName);
    }

    public void enterLastName(String lastName) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_lastName_name"))).sendKeys(lastName);
    }

    public void enterMobilnumber(String mobileNumber) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_mobileNumber_xpath"))).sendKeys(mobileNumber);
    }
}
