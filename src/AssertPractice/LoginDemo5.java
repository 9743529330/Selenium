package AssertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo5 {
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
        ArrayList<String> expected=new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        // second method
       /* ArrayList<String> expected=new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");*/
        ArrayList<String> actual=new ArrayList<>();
        try {
            List<WebElement> wblist=driver.findElements(By.xpath("//label[@class='error']"));
            actual.add(wblist.get(0).getText());
            actual.add(wblist.get(1).getText());
        }
        catch (Exception e)
        {
        }
        System.out.println("expected="+expected1);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"wrong or error message");
    }
}
