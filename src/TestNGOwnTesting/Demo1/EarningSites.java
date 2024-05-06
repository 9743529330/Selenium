package TestNGOwnTesting.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EarningSites {
    WebDriver driver;
    @BeforeClass
    public void openBrowser()
    {
      driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public void closebrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Test
    public void Earn1()
    {
       driver.get("http://facebook.com");
    }
    @Test
    public void Earn2()
    {
        driver.get("http://trading.com");
    }
    @Test
    public void Earn3()
    {
        driver.get("http://investment.com");
        driver.close();
    }
}
