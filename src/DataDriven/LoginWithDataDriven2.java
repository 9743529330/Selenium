package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

  public class LoginWithDataDriven2 {
  @Test(dataProvider = "getMyData3")
    public void loginTest2(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
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
    Object[][] getMyData3() throws IOException {
        //1.read the file
        FileInputStream fis=new FileInputStream("Data/MyData3.xlsx");

        //2.convert this file object into a workbook object
        XSSFWorkbook Workbook=new XSSFWorkbook(fis);

        //3.get the sheet
        XSSFSheet Sheet= Workbook.getSheet("Sheet1");

        //4.Count the active rows
        int rowCount=Sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][2];
        for (int i=0;i<rowCount;i++) {
            XSSFRow row = Sheet.getRow(i);
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



