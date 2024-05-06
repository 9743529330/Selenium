import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/rahul/Desktop/mithlesh2.html");
        Thread.sleep(4000);
        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));
        if (java.isDisplayed())
            java.click();
        Thread.sleep(4000);
       if (selenium.isDisplayed())
            selenium.click();
        Thread.sleep(4000);
        if (cucumber.isDisplayed())
            cucumber.click();

    }
}
