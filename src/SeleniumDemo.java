
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com ");
        driver.navigate().back();
       driver.get("http://facebook.com");
       driver.navigate().forward();
       driver.get("https://scriptinglogic.com/");
       driver.navigate().back();
       Thread.sleep(4000);
       driver.navigate().to("http://facebook.com");
      Thread.sleep(4000);
       driver.navigate().back();
       Thread.sleep(4000);
       driver.navigate().forward();
       Thread.sleep(4000);
       driver.navigate().refresh();
      // driver.close();
     //  driver.quit();
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());


    }
}
