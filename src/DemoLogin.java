import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoLogin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.invoiceplane.com/");
        WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
        txtUser.sendKeys("admin@invoiceplane.com");
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
        txtPass.sendKeys("demopassword");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//tr[td[a[text()='Allen Tan'] ]]//a[contains(@class,'dropdown')]")).click();
        driver.findElement(By.xpath("//div[@class='options btn-group open']//li[1]//a[1]")).click();
    }
}
