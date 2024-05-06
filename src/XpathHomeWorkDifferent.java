import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHomeWorkDifferent {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUser = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
        txtUser.sendKeys("admin");
        WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        txtPass.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input"));
        btnLogin.click();
        driver.findElement(By.xpath("//a[@href='view_customers.php']")).click();
       driver.findElement(By.xpath("//a[contains(@href,'d_customer')]")).click();
        //driver.findElement(By.xpath("//a[contains(@href,'d_customer')]")).click();

    }
}
