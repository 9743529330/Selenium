import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
      //  driver.get("http://facebook.com");
        //driver.get("http://youtube.com");
        //driver.get("http://click.in");
        driver.get("http://java.com");
       driver.findElement(By.xpath("//a[text()='Log into Facebook']")).click();



    }
}
