import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.findElement(By.linkText("Add Supplier")).click();
         driver.findElement(By.name("name")).sendKeys("rahul kumar");
         driver.findElement(By.name("contact1")).sendKeys("747693330");
        driver.findElement(By.name("contact2")).sendKeys("7018659309");
        driver.findElement(By.name("address")).sendKeys("daulatpur bihta bihar near kumhartoli bihta (patna)");
        driver.findElement(By.name("Submit")).click();


    }
}
