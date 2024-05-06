package ActionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraMouceHover {
    @Test
    public void mouceHover()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Actions actions=new Actions(driver);
        WebElement linkWomen = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
        actions.moveToElement(linkWomen).perform();
        driver.findElement(By.xpath("//a[text()='Jeans' and @data-reactid='225']")).click();

    }
}
