package JunitDemo;

import jdk.jfr.Enabled;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo1 {
    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("mahskdl");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("msjdkdkd");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

   /* @Test
    public void loginTest3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();*/
        @Test
        public void loginTest4()
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://stock.scriptinglogic.org/");
            WebElement txtUser = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
            txtUser.sendKeys("admin");
            WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
            txtPass.sendKeys("admin");
            WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
            btnLogin.click();


        }
    }

