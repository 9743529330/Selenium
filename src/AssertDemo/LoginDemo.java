package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginDemo {
    @Test
            public void loginTest1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin1");
        wblist.get(2).click();
        String expected="http://stock.scriptinglogic.net/dashboard.php";
        String actual=driver.getCurrentUrl();
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);
        Assert.assertEquals(actual,expected,"this is not a dashboard");



    }
}
