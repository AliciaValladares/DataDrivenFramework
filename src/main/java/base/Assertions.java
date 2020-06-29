package base;

import org.openqa.selenium.WebDriver;

public class Assertions {

    public static boolean validateURL(WebDriver driver, String expURL) {
        boolean url = false;
          if(driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
              url = true;
          }
        return url;
    }

    public static boolean validateTitle(WebDriver driver, String expTitle) {
        boolean title = false;
        if(driver.getTitle().equalsIgnoreCase(expTitle)) {
            title = true;
        }
        return title;
    }

}
