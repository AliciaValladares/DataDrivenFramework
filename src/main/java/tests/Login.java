package tests;

import base.DriverInstance;
import dataGenerator.DataGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.LoginPage;
import java.io.IOException;

public class Login extends DriverInstance {

    WebDriver driver;

    @Test(dataProvider="Excel", dataProviderClass = DataGenerator.class)
    public void login(String username, String password) throws IOException {
        System.out.println("before done");
        LoginPage login = new LoginPage(driver);
        System.out.println("Llamada ala página");
        login.enterUsername(username);
        login.enterPassword(password);
        login.submit();
    }
}
