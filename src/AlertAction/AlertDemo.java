package AlertAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/rahul/Downloads/amol.html");
        driver.findElement(By.xpath("//input[@id='rad0']"));
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}


