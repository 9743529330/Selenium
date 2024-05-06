import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement txtUser = driver.findElement(By.id("email"));
        txtUser.sendKeys("admin");
        WebElement txtPassord = driver.findElement(By.id("pass"));
        txtPassord.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();

    }
}
