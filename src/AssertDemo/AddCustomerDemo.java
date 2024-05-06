package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddCustomerDemo {
    @Test
    public void loginTest5()
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
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement lnkAdd = driver.findElement(By.partialLinkText("Add Custom"));
        lnkAdd.click();
        String name="bujjja";
        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);
        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("645633330");
        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("5018659309");
        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("paulatpur bkljta bbjkihar lpiar lpydhumhartoli bpptta (bihta)");
        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

        String expected="[ "+name+" ] customer details added!";
        String actual= "";
       try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();//here giving both the condition of xpath duplicate key or added key
           //getting test failed msg please check where did i mistake
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"wrong messages / customer not added");
    }
}
