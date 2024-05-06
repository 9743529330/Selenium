import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/rahul/Desktop/mithlesh2.html");
        //1.find the web element
        WebElement mulSelTex = driver.findElement(By.id("multiseltext"));
        //2.create the object of the select class
        Select seltext=new Select(mulSelTex);
        seltext.selectByIndex(2);
        Thread.sleep(4000);
        seltext.selectByIndex(0);
        Thread.sleep(4000);
        seltext.selectByIndex(1);
        Thread.sleep(4000);
        seltext.deselectByIndex(1);
        Thread.sleep(4000);
        seltext.deselectByIndex(2);
        Thread.sleep(4000);
        seltext.deselectAll();

    }
}
