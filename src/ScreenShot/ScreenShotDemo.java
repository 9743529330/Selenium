package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotDemo {
    @Test
    public void ScreenshotTest() throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");
        TakesScreenshot ts= (TakesScreenshot) driver;
        File scrFile=ts.getScreenshotAs(OutputType.FILE);
        String timeStamp=new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String filename="IMG"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("c:\\screenshots\\"+filename));
    }
}
