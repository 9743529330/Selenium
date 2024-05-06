import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class EdgeDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");

        driver.get("https://i2.ytimg.com/vi/vaKPYsgsIYg/0.jpg");
       driver.get("http://facebook.com");
       //driver.get("gmail.com");
       driver.get("http://www.naukri.com");
       driver.get("http://www.biharsarkar.com");
       //driver.get("dell.com");
    }
}
