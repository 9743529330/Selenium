import com.mysql.cj.jdbc.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuappLogin {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login ");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='username']"));
        txtUsername.sendKeys("tomsmith");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("SuperSecretPassword!");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
        WebElement powerLogin = driver.findElement(By.xpath("//a[@target='_blank']"));
        powerLogin.click();
    }
}
