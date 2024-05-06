package TestNGDemo.Demo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {
    WebDriver driver;
    @BeforeClass
    public void openBrowse()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();

    }
    @Test
    public void facebooklogin()
    {
        driver.get("http://facebook.com");
    }
    @Test
    public void youtube()
    {
        driver.get("http://youtube1.com");
    }
    @Test
    public void twitter()
    {
        driver.get("http://twitter.com");
    }
    @Test
    public void instagram()
    {
        driver.get("http://instagram.com");
    }
}
