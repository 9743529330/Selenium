package TestNGOwnTesting.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManoranjanSite {
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
    public void Hasho1()
    {
        driver.get("http://youtube.com");
    }
    @Test
    public void Hasho2()
    {
        driver.get("http://laughterchannel.com");
    }
    @Test
    public void Hasho3()
    {
        driver.get("http://jokes.com");
    }
    @Test
    public void FacebookLogin()
    {
        driver.get("http://facebook.com");
    }
    @Test
    public void InstaGramOpen()
    {
        driver.get("http://instagram.com");
    }
    @Test
    public void ChatGptTyping()
    {
        driver.get("http://chatgpt.com");
    }
}
