import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifePartner {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/ ");
        WebElement txtLooking = driver.findElement(By.id("sel3"));
        txtLooking.sendKeys("bridge");
        WebElement txtAge = driver.findElement(By.id("sel1"));
        txtAge.sendKeys("25");
        WebElement txtCommunity = driver.findElement(By.name("cm"));
        txtCommunity.sendKeys("hindu");
        WebElement txtMarrital = driver.findElement(By.id("sel5"));
        txtMarrital.sendKeys("Nevermarried");
        driver.findElement(By.className("search-btn")).click();
        driver.findElement(By.linkText("female1203880")).click();
    }
}
