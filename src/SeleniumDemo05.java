import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo05 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login ");
        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("tomsmith");
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("SuperSecretPassword!");
        WebElement btnLogin = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
         btnLogin.click();

    }
}
