import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        WebElement txtUser = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        txtUser.sendKeys("admin");
        Thread.sleep(4000);
        WebElement txtPass = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        txtPass.sendKeys("admin");
        Thread.sleep(4000);
        WebElement btnLogo = driver.findElement(By.xpath("//input[contains(@value,'LOG IN')]"));
        btnLogo.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[contains(@href,'add_c')]")).click();
        Thread.sleep(4000);
        WebElement txtAdd = driver.findElement(By.xpath("//input[contains(@placeholder,'YOUR FULL ')]"));
        txtAdd.sendKeys("mithlesh kumar");
        Thread.sleep(4000);
        WebElement txtcon1 = driver.findElement(By.xpath("//input[contains(@name,'contact1')]"));
        txtcon1.sendKeys("9996633325");
        Thread.sleep(4000);
        WebElement txtcon2 = driver.findElement(By.xpath("//input[contains(@name,'contact2')]"));
        txtcon2.sendKeys("8788996336");
        Thread.sleep(4000);
        WebElement txtAddr = driver.findElement(By.xpath("//textarea[contains(@cols,'1')]"));
        txtAddr.sendKeys("mahavir nagar patna jali form kanataka highway express way district pune india 456302368");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[contains(@value,'d')]")).click();
        driver.close();


    }
}
