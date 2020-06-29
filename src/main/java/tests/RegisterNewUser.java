package tests;

import base.DriverInstance;
import dataGenerator.DataGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.LoginPage;

import javax.xml.crypto.Data;
import java.io.IOException;

public class RegisterNewUser extends DriverInstance {
    WebDriver driver;

    @Test(dataProvider = "Register", dataProviderClass = DataGenerator.class)
    public void registerNewUser(String firstName, String mobileNumber, String lastName) throws IOException {
        LoginPage register = new LoginPage(driver);
        register.enterFirstName(firstName);
        register.enterLastName(lastName);
        register.enterMobilnumber(mobileNumber);
    }
}
