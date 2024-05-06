package TestNGDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGDemo1 {
    @Test
    public void loginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys("admin");
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPass.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }

    @Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys("mmmmm");
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPass.sendKeys("mmmmm");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }

    @Test
    public void loginTest3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys("");
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPass.sendKeys("");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }
}
