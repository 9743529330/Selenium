import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/rahul/Desktop/mithlesh2.html");
        WebElement drpseltext = driver.findElement(By.id("seltext"));
        Select seltext=new Select(drpseltext);
        Thread.sleep(4000);
        seltext.selectByIndex(1);
        Thread.sleep(4000);
        seltext.selectByIndex( 3);
        Thread.sleep(4000);
        seltext.selectByVisibleText(" text1 ");

    }
}
