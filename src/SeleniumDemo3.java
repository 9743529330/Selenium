import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/mylisting/registration.html");
        WebElement txtUser = driver.findElement(By.id("name"));
        txtUser.sendKeys("mithlesh kumar");
        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys("rahulraj12345@gmail.com");
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("mithlesh@70199");
        WebElement txtRepassword = driver.findElement(By.name("re_password"));
        txtRepassword.sendKeys("mithlesh@70199");
        WebElement securityImage = driver.findElement(By.className("securityImg"));
         securityImage.click();
         driver.wait(40000);
        WebElement setValue = driver.findElement(By.name("scode"));
        setValue.sendKeys("786967");
        WebElement clickButton = driver.findElement(By.id("submit"));
        clickButton.click();


    }
}
