package AlertAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTryIt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//button[normalize-space()='Click me to display Date and Time.']")).click();
        actions.doubleClick().perform();
       // Thread.sleep(4000);

    }
}
