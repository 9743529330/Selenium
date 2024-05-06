import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewDemoProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.click.in/pune/classifieds/60/post.html ");
        WebElement jobLocation = driver.findElement(By.id("source_118"));
        Select seljoblocation=new Select(jobLocation);
        Thread.sleep(4000);
        seljoblocation.selectByVisibleText("Bangalore");
        seljoblocation.selectByVisibleText("Hyderabad & Secunderabad");
        seljoblocation.selectByVisibleText("Pune");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();
        Thread.sleep(4000);
        WebElement joblocationremove = driver.findElement(By.id("fld_118"));
        Select selLocation=new Select(joblocationremove);
        selLocation.selectByIndex(0);
        selLocation.selectByIndex(2);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

        WebElement quilification = driver.findElement(By.id("source_508"));
        Select selquilification=new Select(quilification);
        Thread.sleep(4000);
        selquilification.selectByVisibleText("B.Sc");
        Thread.sleep(4000);
        selquilification.selectByVisibleText("BDS");
        Thread.sleep(4000);
        selquilification.selectByVisibleText("CA");
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement deselectquali = driver.findElement(By.id("fld_508"));
        Select desequili=new Select(deselectquali);
        Thread.sleep(4000);
        desequili.selectByIndex(1);
        desequili.selectByIndex(2);
driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[2]")).click();






    }
}
