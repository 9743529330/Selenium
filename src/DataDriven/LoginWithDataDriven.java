package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataDriven {
    @Test(dataProvider = "getData")
    public void loginTest1(String username,String password)
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
    Object[][] getData()
    {
        Object[][] data = new Object[4][2];
        data[0][0]="admin";
        data[0][1]="admin";

        data[1][0]="admin1";
        data[1][1]="admin1";

        data[2][0]="admin2";
        data[2][1]="admin2";

        data[3][0]="admin3";
        data[3][1]="admin3";
        return data;


    }
}
