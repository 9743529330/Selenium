import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/ ");
        List<WebElement> wblist=driver.findElements(By.className("form-control"));
        System.out.println("size="+wblist.size());
        wblist.get(0).sendKeys("demo");
        wblist.get(1).sendKeys("demo");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
    }
}
