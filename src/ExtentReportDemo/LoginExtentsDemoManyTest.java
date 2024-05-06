package ExtentReportDemo;

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

public class LoginExtentsDemoManyTest {

    ExtentReports extent;

    @BeforeClass
    public void initExtentsReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("stock management system");
        reporter.config().setReportName("regression testing report");
        extent.setSystemInfo("developer name", "mithlesh");
        extent.setSystemInfo("tester name", "amol sir");
        extent.setSystemInfo("project name", "stock management");
        extent.setSystemInfo("deadline name", "25 march 2024");
    }

    @AfterClass
    public void writeToReport() {
        extent.flush(); //writes the report
    }

    @Test
    public void logintest1() throws IOException {

        ExtentTest test = extent.createTest("valid test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        test.info("browser is opened and url are opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin1");
        test.info("login is entered");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin1");
        test.info("password is entered");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is click");
        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();


        try {

            Assert.assertEquals(actual, expected, "this is not a dashboard !");
            test.pass("this test is pass ");
        } catch (AssertionError e) {
                test.fail(e.getMessage());
           test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));

        }
    }


    @Test
    public void logintest2() throws IOException {
        ExtentTest test = extent.createTest("Invalid test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        test.info("browser is opened and url are opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin123");
        test.info("login is entered");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin123");
        test.info("password is entered");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is click");
        String expected = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        try {

            Assert.assertEquals(actual, expected, "Wrong Username or Password");
            test.pass("this test is pass ");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));

        }
    }

    @Test
    public void logintest3() throws IOException {
        ExtentTest test = extent.createTest("Blank login test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        test.info("browser is opened and url are opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");
        test.info("login is entered");
        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");
        test.info("password is entered");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is click");
        String expected = "http://stock.scriptinglogic.net/";
        String actual = driver.getCurrentUrl();
        try {

            Assert.assertEquals(actual, expected, "this is not a dashboard !");
            test.pass("this test is pass ");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }
    }
}

