import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo1 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/index.php");
        WebElement txtUsername=driver.findElement(By.name("uid"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword=driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("btnReset"));
        btnLogin.click();


    }
}
