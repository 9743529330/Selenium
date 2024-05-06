package TestNGDemo.Real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Socialsites extends Base{


    @Test(priority = 1)
    public void Facebooklogin()
    {
        driver.get("http://facebook.com");
    }
    @Test(priority = 2)
    public void YoutubeLogin()
    {
        driver.get("http://youtube.com");
    }
    @Test(priority = 3)
    public void Gmaillogin()
    {
        driver.get("http://gmail.com");
    }
    @Test(priority = 4)
    public void InstaLogin()
    {
        driver.get("http://instagram.com");
    }
}
