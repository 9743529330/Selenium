package JunitDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class JunitDemo4 {
    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
        wblist.get(2).click();
    }
@Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad566");
        wblist.get(1).sendKeys("ad4555");
        wblist.get(2).click();
    }
    @Test

    public void loginTest3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad123");
        wblist.get(1).sendKeys("adm2333");
        wblist.get(2).click();
    }
    @Test

    public void loginTest4() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
        wblist.get(2).click();
    }
    @Test
    public void loginTest5() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("ad122");
        wblist.get(1).sendKeys("adm233");
        wblist.get(2).click();
    }
    @Test
    public void loginTest6() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
        wblist.get(2).click();
    }
}