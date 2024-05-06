import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
        WebElement txtUser = driver.findElement(By.id("input-username"));
        txtUser.sendKeys("demo");
        WebElement txtPassword = driver.findElement(By.id("input-password"));
        txtPassword.sendKeys("demo");
       // driver.findElement(By.tagName("button")).click();
        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();
        driver.findElement(By.xpath("//a[@class='parent']")).click();
    }
}
