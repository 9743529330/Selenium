package TestNGDemo2.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Socialsites {
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
