package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreemShotDemo1 {
    @Test


        public void ScreenshotTest () throws IOException {


            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://facebook.com");
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcfile = ts.getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
            String fileName = "IMG"+timestamp+".png";
            FileUtils.copyFile(srcfile, new File("c:\\screenshots\\img.png"));
        }
    public static String getMyScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timestamp+".png";
        FileUtils.copyFile(srcfile, new File("Reports\\screenshots\\"+fileName));
        return fileName;

    }

}

