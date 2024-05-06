import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/ ");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[4]/a")).click();
        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys("raju kumar singh");
        WebElement txtContact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys("8635936983");
        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("8639639866");
        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("Digha polshan nirala nagar patna 800011");
        driver.findElement(By.xpath("//input[@value='Add']")).click();

    }
}
