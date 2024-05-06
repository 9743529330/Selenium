package ListenersClasses.lib;

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

public class ForExtentReport {
    public static <reporter> ExtentReports initExtentReport(){
        ExtentSparkReporter reporter=new ExtentSparkReporter("ReportListner/report.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("stock management system");
        extent.setSystemInfo("project name","stock management system");
        extent.setSystemInfo("Developers name","mithlesh kr");
        extent.setSystemInfo("tester name","sony roy");
        extent.setSystemInfo("project start date","1 jan 2024");
        extent.setSystemInfo("executed by","rahul kr");
        extent.setSystemInfo("project sponcer by","amol sir");
        return extent;
    }
    public static String getExtentReportScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timestamp+".png";
        FileUtils.copyFile(srcfile, new File("ReportListener\\screenshots\\"+fileName));
        return fileName;

    }


}
