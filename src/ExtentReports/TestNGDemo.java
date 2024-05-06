package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo {
    ExtentReports extent;

    @BeforeClass
    public void initExtentReport() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("Stock managment system");
        extent.setSystemInfo("project name","stock management system");
        extent.setSystemInfo("project start date","10 jan 2024");
        extent.setSystemInfo("Developer by","amol sir");
        extent.setSystemInfo("tester by","mithlesh kumar");
        extent.setSystemInfo("executed by","rahul kumar");
        extent.setSystemInfo("project deadline","10 apr 2024");
    }
    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void loginTest1() {
        ExtentTest test=extent.createTest("valid login test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        test.info("browser is opened and maximize");
        driver.get("https://stock.scriptinglogic.org/");
        test.info("Url is entered ");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        test.info("Username is entered");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        test.info("Password is enterd");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
        test.info("Login button is clicked and open");
    }
    @Test
    public void loginTest2() {
        ExtentTest test=extent.createTest("Invalid login test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        test.info("browser is opened and maximize");
        driver.get("https://stock.scriptinglogic.org/");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin123");
        test.info("username is entered");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin123");
        test.info("password is enterd");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }
    @Test
    public void loginTest3() {
        ExtentTest test=extent.createTest("Blank login test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        test.info("browser is opened and maximize");
        driver.get("https://stock.scriptinglogic.org/");
        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");
        test.info("username is entered");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");
        test.info("password is enterd");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();
    }
}
