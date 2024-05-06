import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAddCustomer {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {
         driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Test
    public void addcustomer1()
    {
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.findElement(By.linkText("Add Supplier")).click();
         driver.findElement(By.name("name")).sendKeys("bonu kumar");
         driver.findElement(By.name("contact1")).sendKeys("747693330");
        driver.findElement(By.name("contact2")).sendKeys("7018659309");
        driver.findElement(By.name("address")).sendKeys("ksaulatpur bihta bihar near kumhartoli bihta (patna)");
       driver.findElement(By.name("Submit")).click();
    }
    @Test
    public void addcustomer2()
    {
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.findElement(By.linkText("Add Supplier")).click();
        driver.findElement(By.name("name")).sendKeys("mmmahul kumar");
        driver.findElement(By.name("contact1")).sendKeys("747693330");
        driver.findElement(By.name("contact2")).sendKeys("7018659309");
        driver.findElement(By.name("address")).sendKeys("laulatpur bihta bihar near kumhartoli bihta (patna)");
        driver.findElement(By.name("Submit")).click();
    }
    @Test
    public void addcustomer3()
    {
        driver.get("http://stock.scriptinglogic.net/");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
       btnLogin.click();
        driver.findElement(By.linkText("Add Supplier")).click();
        driver.findElement(By.name("name")).sendKeys("mmmmmm kumar");
        driver.findElement(By.name("contact1")).sendKeys("747693330");
        driver.findElement(By.name("contact2")).sendKeys("7018659309");
        driver.findElement(By.name("address")).sendKeys("jlllkllaulatpur bihta bihar near kumhartoli bihta (patna)");
        driver.findElement(By.name("Submit")).click();
    }
}
