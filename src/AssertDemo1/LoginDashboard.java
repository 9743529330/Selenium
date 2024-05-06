package AssertDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDashboard {
    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "Dashboard";
        String actual="";
        try {
         actual = driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).getText();
        }
        catch (Exception e)
        {
            System.out.println("expected=" + expected);
            System.out.println("actual=" + actual);

            Assert.assertEquals(expected, actual, "this is not a dashboard");


        }
    }
}

