package dataGenerator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class DataGenerator {

    @DataProvider(name="Excel")
    public static Object[][] testDataGenerator(Method met) throws IOException {
        if(met.getName().equalsIgnoreCase("login")) {
            FileInputStream file = new FileInputStream("./src/main/java/dataProvider/DataProvider.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet loginSheet = workbook.getSheet("Login");
            int numberOfRows = loginSheet.getPhysicalNumberOfRows();
            Object[][] testData = new Object[numberOfRows][2];

            for (int i = 0; i < numberOfRows; i++) {
                //Create a row object
                XSSFRow row = loginSheet.getRow(i);
                //Create a cell object
                XSSFCell username = row.getCell(0);
                XSSFCell password = row.getCell(0);
                //Get data stored
                testData[i][0] = username.getStringCellValue();
                testData[i][1] = password.getStringCellValue();
            }
            return testData;
        }
        else if(met.getName().equalsIgnoreCase("registerNewUser")) {
            FileInputStream file = new FileInputStream("./src/main/java/dataProvider/DataProvider.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet loginSheet = workbook.getSheet("Register");
            int numberOfRows = loginSheet.getPhysicalNumberOfRows();
            Object [] [] testData = new Object[numberOfRows][2];

            for(int i=0;i<numberOfRows;i++) {
                //Create a row object
                XSSFRow row = loginSheet.getRow(i);
                //Create a cell object
                XSSFCell firstName = row.getCell(0);
                XSSFCell lastName = row.getCell(0);
                XSSFCell mobileNumber = row.getCell(0);
                //Get data stored
                testData[i][0] = firstName.getStringCellValue();
                testData[i][1] = lastName.getStringCellValue();
                testData[i][2] = mobileNumber.getStringCellValue();
            }
            return testData;
        }
        else {
            Object[][] testData = new Object[2][3];
            return testData;
        }
    }
}
