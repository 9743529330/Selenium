package AssertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo3 {
    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
        String expected1="PLEASE ENTER A USERNAME";
        String expected2="PLEASE PROVIDE A PASSWORD";
        String[] expected={expected1,expected2};
        String[] actual=null;
        try {
            String actual1 = driver.findElement(By.xpath("//label[@class='error' and @for='login-username']")).getText();
            String actual2 = driver.findElement(By.xpath("//label[@class='error' and @for='login-password']")).getText();
            actual[0] = actual1;
            actual[1] = actual2;
        }
        catch (Exception e)
        {
        }
       /* System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/
        Assert.assertEquals(actual,expected,"wrong or no error msg");


    }
}
