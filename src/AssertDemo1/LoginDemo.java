package AssertDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class LoginDemo {
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
       /* String expected="http://stock.scriptinglogic.net/dashboard.php";
        String actual=driver.getCurrentUrl();*/
        String expected = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = "";
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
       try {
            Assert.assertEquals(expected, actual, "wrong userid and password");
        }
        catch (Exception e )
        {
        }
    }
}
