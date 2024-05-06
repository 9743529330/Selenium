package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ScreenShot.ScreemShotDemo1.getMyScreenshot;

public class TestNGDemo1 {
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
    public void loginTest1() throws IOException {
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
        String expected="POSNIC - Dashboard";
        String actual=driver.getTitle();
        try {
            Assert.assertEquals(actual, expected, "this is not dashboard");
            test.pass("this is pass");
        }
        catch (AssertionError e){
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }


    }
    @Test
    public void loginTest2() throws IOException {
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
        test.info("Login button is entered and clicked");
        String expected="https://stock.scriptinglogic.org/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual=driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"invalid id and password");
            test.pass("this test is pass");
        }
        catch (AssertionError e){
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

    }
    @Test
    public void loginTest3() throws IOException {
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
        String expected="https://stock.scriptinglogic1.org/";
        String actual=driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"this is blank userid and password");
            test.pass("this is pass ");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
    }
}
