import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class SeleniumXpathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");
        WebElement joblocation = driver.findElement(By.name("source_118[]"));
        Select seljoblocation=new Select(joblocation);
        seljoblocation.selectByVisibleText("Bangalore");
        seljoblocation.selectByVisibleText("Noida");
        seljoblocation.selectByVisibleText("Ahmedabad");
     // driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();
     //WebElement joblocation2=driver.findElement(By.name("fld_118[]"));
     //Select seljoblocation2=new Select((joblocation2));
     //seljoblocation2.selectByIndex(0);
//seljoblocation2.selectByIndex(2);
     //driver.findElement(By.xpath("//*[@id="post_form"/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();
       // txtRole.sendKeys("software engineer");
       // WebElement txtExperience = driver.findElement(By.xpath("//span[@id='select2-chosen-1']"));
        //txtExperience.sendKeys("4");
    }
}