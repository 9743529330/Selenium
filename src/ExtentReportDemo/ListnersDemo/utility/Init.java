package ExtentReportDemo.ListnersDemo.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Init {
    public static String getScreenshotForListeners(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timestamp+".png";
        FileUtils.copyFile(srcfile, new File("Reports//screenshots//"+fileName));
        return fileName;

    }
    public static ExtentReports initExtentsReports()
    {
        ExtentSparkReporter reporter=new ExtentSparkReporter("Reports/reports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("stock management system");
        reporter.config().setReportName("regression testing report");
        extent.setSystemInfo("developer name","mithlesh");
        extent.setSystemInfo("tester name","amol sir");
        extent.setSystemInfo("project name","stock management");
        extent.setSystemInfo("deadline name","25 march 2024");
        return extent;


    }
}
