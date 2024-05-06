package AssertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCustomerDemo {
    WebDriver driver;
    @BeforeClass
    public void dologin() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }
        @Test
        public void addCustomerDemo1()
        {
            driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();
            driver.findElement(By.xpath("//input[@name='Submit']")).click();
            String expected="PLEASE ENTER A CUSTOMER NAME";
            String actual="";
            try {
                actual = driver.findElement(By.xpath("//input[@id='name']")).getText();
            }
            catch (Exception e)
            {
            }
            System.out.println("Expected="+expected);
            System.out.println("actual="+actual);
            Assert.assertEquals(actual,expected,"wrong or no error msg");
        }
    }

