import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddCustomer12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        Thread.sleep(2000);
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        Thread.sleep(2000);
        txtUsername.sendKeys("admin");
        Thread.sleep(2000);
        WebElement txtPassword = driver.findElement(By.name("password"));
        Thread.sleep(2000);
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.findElement(By.linkText("Add Customer")).click();
        Thread.sleep(2000);
        WebElement txtFullname = driver.findElement(By.name("name"));

        txtFullname.sendKeys("Mithilesh Mk kumar");
        Thread.sleep(2000);
        WebElement txtContact1 = driver.findElement(By.id("buyingrate"));
        Thread.sleep(2000);
        txtContact1.sendKeys("7896359530");
        WebElement txtContact2 = driver.findElement(By.id("sellingrate"));
        Thread.sleep(2000);
        txtContact2.sendKeys("8963695886");
        WebElement txtAddress = driver.findElement(By.name("address"));
        Thread.sleep(2000);
        txtAddress.sendKeys("Mahavir nagar near camera bank hdfc bihta patna");
        Thread.sleep(2000);
        driver.findElement(By.name("Submit")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
