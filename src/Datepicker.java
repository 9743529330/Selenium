import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement dateElement=driver.findElement(By.id("datepicker"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','02/20/2024')",dateElement);
    }
}
