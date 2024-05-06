package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo3 {
    @Test
    public void loginTest2()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
       /* String expected="http://stock.scriptinglogic.net/dashboard.php";
        String actual=driver.getCurrentUrl(); */
       /* String expected="POSNIC - Dashboard";
        String actual=driver.getTitle();*/
        String expected="Wrong Username or Password";
        String actual=" ";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
       System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect username & password");
    }
}
