package AssertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
       /* String expected="https://stock.scriptinglogic.org/dashboard.php";
        String actual=driver.getCurrentUrl();*/
        String expected="POSNIC - Dashboard";
        String actual=driver.getTitle();

       /* String expected="Dashboard";
        String actual="";*/
       /* try {
            actual = driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).getText();
        }
        catch (Exception e)
        {

        }*/
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"this is not dashboad");
    }
}
