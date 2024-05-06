package TestNGOwnTesting.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearningSite {
    WebDriver driver;
    @BeforeClass
    public void openBrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public void closebrowse() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Test
    public void Learn1()
    {
        driver.get("http://javaTpoint.com");
    }
    @Test
    public void Learn2()
    {
        driver.get("http://selenium.com");
    }
    @Test
    public void Learn3()
    {
        driver.get("http://cucumber.com");
    }
}
