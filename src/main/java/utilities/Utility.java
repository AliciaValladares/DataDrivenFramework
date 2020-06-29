package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    // Fetch data from properties file
    public static String fetchPropertyValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("./src/main/java/config/config.properties");
        Properties property = new Properties();

        //Load the file
        property.load(file);
        //Read the file
        return property.get(key).toString();
    }

    public static String fetchLocatorValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("./src/main/java/config/elements.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }
}
