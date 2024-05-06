package DataDriven;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginWithDataDrivenXLs {
    @Test(dataProvider = "getMyData1")
    public void loginTest1(String username,String password)
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtusername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtusername.sendKeys(username);
        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtpassword.sendKeys(password);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();


    }

    @DataProvider
    Object[][] getMyData1() throws IOException {
        //1.read the file
        FileInputStream fis=new FileInputStream("Data/MyData1.xls");

        //2.convert this file object into a workbook object
        HSSFWorkbook Workbook=new HSSFWorkbook(fis);

        //3.get the sheet
        HSSFSheet Sheet= Workbook.getSheet("Sheet1");

        //4.Count the active rows
        int rowCount=Sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][2];
        for (int i=0;i<rowCount;i++) {
            HSSFRow row = Sheet.getRow(i);
            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();
        }
        return data;

    }
}


      /*   Object[][] data = new Object[4][2];
       data[0][0]="admin";
        data[0][1]="admin";

        data[1][0]="admin1";
        data[1][1]="admin1";

        data[2][0]="admin2";
        data[2][1]="admin2";

        data[3][0]="admin3";
        data[3][1]="admin3";*/



