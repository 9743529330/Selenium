import org.checkerframework.framework.qual.EnsuresQualifierIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        List<WebElement> wblist=driver.findElements(By.tagName("a"));
        System.out.println("size=" +wblist.size());

       /* for (int i=0;i<wblist.size();i++)
            System.out.println(wblist.get(i).getText()); */
        for (WebElement wb:wblist)
        {
            System.out.println(wb.getText());
        }
    }
}
