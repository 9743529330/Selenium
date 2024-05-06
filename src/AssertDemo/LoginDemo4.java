package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginDemo4 {
    @Test
    public void loginTest2()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        ArrayList<String> expected=new ArrayList<>() {{
            add("PLEASE ENTER A USERNAME");
            add("PLEASE PROVIDE A PASSWORD");
        }};
        String usernameMsg=" ";
        String passwordMsg=" ";
        ArrayList<String> actual=new ArrayList<>();
        try {
            usernameMsg = driver.findElement(By.xpath(" //label[normalize-space()='Please enter a username']")).getText();
            passwordMsg = driver.findElement(By.xpath("//label[normalize-space()='Please provide a password']")).getText();
        }
        catch (Exception e)
        {
        }
        actual.add(usernameMsg);
        actual.add(passwordMsg);
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);
        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }
}
