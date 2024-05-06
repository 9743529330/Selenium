package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataprovider {
    @Test(dataProvider = "getMyData")

    public void loginTest(String username, String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/ ");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys(username);
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys(password);
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    @DataProvider
    public Object[][] getMyData() {
        Object[][] data = new Object[4][2];
        data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "invalid";
        data[1][1] = "invalid";

        data[2][0] = "";
        data[2][1] = "";

        data[3][0] = "admin123";
        data[3][1] = "admin456";
        return data;
    }
}

