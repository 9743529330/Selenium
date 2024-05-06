package TestNGDemo.Real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jobsites extends Base{

    @Test(priority = 4)
    public void NaukriLogin()
    {
        driver.get("http://naukri.com");
    }
    @Test(priority = 3)
    public void LinkdlinLogin()
    {
        driver.get("http://linkdlin.com");
    }
    @Test(priority = 2)
    public void SarkariNaukrilogin()
    {
        driver.get("http://sarkarinaukri.com");
    }
    @Test(priority = 1)
    public void ShineLogin()
    {
        driver.get("http://shine.com");
    }
}
