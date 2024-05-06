import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://gmail.com");
        Thread.sleep(4000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://facebook.com");
        Thread.sleep(4000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://naukri.com");
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
