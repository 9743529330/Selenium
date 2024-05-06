package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginExtentsDemo {
    ExtentReports extent;
    @BeforeClass
    public void initExtentsReports()
    {
        ExtentSparkReporter reporter=new ExtentSparkReporter("Reports/report.html");
        extent=new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("stock management system");
        reporter.config().setReportName("regression testing report");
        extent.setSystemInfo("developer name","mithlesh");
        extent.setSystemInfo("tester name","amol sir");
        extent.setSystemInfo("project name","stock management");
        extent.setSystemInfo("deadline name","25 march 2024");


    }
    @Test
            public void logintest1()
    {
        ExtentTest test =extent.createTest("valid test");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        test.info("browser is opened and url are opened");

    WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");
        test.info("login is entered");
    WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");
        test.info("password is entered");
    WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is click");
        extent.flush();
}
}
