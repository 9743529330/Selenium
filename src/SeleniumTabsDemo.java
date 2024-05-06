import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumTabsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        Thread.sleep(4000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");
        Thread.sleep(4000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://naukri.com");
        Thread.sleep(4000);

        List<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
