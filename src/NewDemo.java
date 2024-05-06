import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class NewDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("http://gmail.com");
        driver.get("http://www.facebook.com");
       // driver.get("http://youtube.com");

    }
}
