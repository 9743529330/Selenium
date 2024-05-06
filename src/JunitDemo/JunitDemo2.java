package JunitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {
    WebDriver driver;
    @Before
    public void openBrowser()
    {
         driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser() throws InterruptedException{
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void loginTest1()
    {

        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");
        WebElement txtPass=driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }
    @Test
    public void loginTest2()
    {

        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("mmmmans");
        WebElement txtPass=driver.findElement(By.id("login-password"));
        txtPass.sendKeys("aushjsbdj");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }
    @Test
    public void loginTest3()
    {
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");
        WebElement txtPass=driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }
}
