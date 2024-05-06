package TestNGDemo.Real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public  class Base  {
   public static WebDriver driver;

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

}
