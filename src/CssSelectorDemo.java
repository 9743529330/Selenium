import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/ ");
       /* WebElement element = driver.findElement(By.tagName("input"));
        element.sendKeys("admin");*/

        List<WebElement> wblist = driver.findElements(By.tagName("input"));
        System.out.println("size="+wblist.size());
        wblist.get(1).sendKeys("admin");
        Thread.sleep(10000);
        wblist.get(0).sendKeys("admin");
        Thread.sleep(10000);
        wblist.get(2).click();
        driver.close();

    }
}
