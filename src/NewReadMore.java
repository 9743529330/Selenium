import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewReadMore {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://scriptinglogic.org/");
        List<WebElement> txt = driver.findElements(By.className("read-more"));
        System.out.println("size="+txt);
       /* System.out.println(txt.get(0).getText());
        System.out.println(txt.get(1).getText());
        System.out.println(txt.get(2).getText());
        System.out.println(txt.get(3).getText());
        System.out.println(txt.get(4).getText());
        System.out.println(txt.get(4).getText());*/
        for (int i=0;i<txt.size();i++)
            System.out.println(txt.get(i).getText());

    }
}
