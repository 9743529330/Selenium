package DataDriven;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginWithDataDriven4 {
    @Test(dataProvider = "getMyData")
    public void loginTest1(String username,String password)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUsername=driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys(username);
        WebElement txtPassword=driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys(password);
        WebElement btnLogin=driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();

    }
    @DataProvider
    Object[][] getMyData() throws IOException {
        //read the file
        FileInputStream fis=new FileInputStream("Data/MyData5.xlsx");

        //2.convert the file object into a workbook object
        XSSFWorkbook workbook=new XSSFWorkbook(fis);

        //3.get the sheet

        XSSFSheet sheet=workbook.getSheet("Sheet2");

        //4.count the active rows
        int rowcount=sheet.getPhysicalNumberOfRows();
        Object[][] data=new Object[rowcount-1][2];

        for (int i=0;i<rowcount-1;i++) {
            XSSFRow row = sheet.getRow(i + 1);
            XSSFCell username = row.getCell(0);
            if (username == null)
                data[i][0] = "";
            else {
                username.setCellType(CellType.STRING);
                data[i][0] = username.toString();
            }
            XSSFCell password = row.getCell(1);
            if (password == null)
                data[i][1] = "";
            else {
                password.setCellType(CellType.STRING);
                data[i][1] = password.toString();

            }
        }


       /* Object[][] data=new Object[4][2];
        data[0][0]="admin";
        data[0][1]="admin";

        data[1][0]="admin1";
        data[1][1]="admin1";

        data[2][0]="admin2";
        data[2][1]="admin2";

        data[3][0]="admin3";
        data[3][1]="admin3";*/
        return data;

    }
}
