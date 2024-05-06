package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JunitDemo6 {
    static WebDriver driver;
@BeforeClass //method written below this annotation run before every test cases of the method.
public static void openBrowser()
{
     driver = new ChromeDriver();
    driver.manage().window().maximize();

        }
        @AfterClass //method written this annotation run last of the all test cases of the method.
        public static void closeBrowser() throws InterruptedException {
            Thread.sleep(4000);
            driver.close();
        }

    @Test
    public void loginTest1() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
       // wblist.get(2).click();
    }
@Test
    public void loginTest2() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad566");
        wblist.get(1).sendKeys("ad4555");
      //  wblist.get(2).click();
}
    @Test

    public void loginTest3() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad123");
        wblist.get(1).sendKeys("adm2333");
       // wblist.get(2).click();
    }
    @Test

    public void loginTest4() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
       // wblist.get(2).click();
    }
    @Test
    public void loginTest5() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad122");
        wblist.get(1).sendKeys("adm233");
       // wblist.get(2).click();
    }
    @Test
    public void loginTest6() {

        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
        wblist.get(2).click();
    }
}