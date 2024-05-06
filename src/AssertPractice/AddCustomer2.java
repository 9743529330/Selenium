package AssertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCustomer2 {
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
        public void addCustomerDemo2()
        {
            driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();
            String customerName= "nith2360";
            driver.findElement(By.name("name")).sendKeys(customerName);
            driver.findElement(By.name("address")).sendKeys("xyz");
            driver.findElement(By.name("contact1")).sendKeys("12345");
            driver.findElement(By.name("contact2")).sendKeys("12346");
            driver.findElement(By.xpath("//input[@name='Submit']")).click();
            String expected=" Customer Details Added ";
            String actual= "";
            try {
                actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
            }
            catch (Exception e)
            {
            }
            boolean result=actual.contains(expected);
            System.out.println("expected="+expected);
            System.out.println("actual="+actual);
            Assert.assertTrue(result,"wrong or no error msg");
        }
    }
