import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wunderground.com/hourly/in/patna/IVAGAH1");
        List<WebElement> wblist = driver.findElements(By.xpath("//th[normalize-space()='Time']"));
        for (int i=0;i<wblist.size();i++)
            System.out.println(wblist.get(i).getText());
    }
}
