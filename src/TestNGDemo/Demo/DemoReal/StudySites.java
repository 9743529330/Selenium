package TestNGDemo.Demo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StudySites {
    WebDriver driver;
    @BeforeClass
    public void openBrowser()
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
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.org");
    }
    @Test
    public void w3school()
    {
        driver.get("http://w3school.com");
    }
    @Test
    public void javaTpoint()
    {
        driver.get("http://javaTpoint.com");
    }
    @Test
    public void kukufm()
    {
        driver.get("http://kukufm.com");
    }

}
