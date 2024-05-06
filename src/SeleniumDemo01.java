import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(8000);
        driver.close();

        WebDriver driver1=new ChromeDriver();
        Thread.sleep(4000);
        driver1.manage().window().maximize();
        driver1.navigate().to("http://facebook.com");
        Thread.sleep(8000);
        driver1.navigate().back();
        driver1.navigate().forward();
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        driver1.close();



    }
}
