package TestNGDemo.Demo.DemoReal;

import jdk.jfr.Enabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jobsites {
    WebDriver driver;
    @BeforeClass
    public  void openBrowse()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Test (priority = 2)
    public void naukrilogin()
    {
        driver.get("http://naukri.com");
    }
    @Test (priority = 3)
    public void timesjob()
    {
        driver.get("http://timesjob.com");
    }
    @Test  (priority = 1)
    public void moster()
    {
        driver.get("http://moster.com");
    }
    @Test(priority = 4)
    public void shine()
    {
        driver.get("http://shine.com");
    }

}


