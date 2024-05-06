package ScreenshotsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestNGDemo {
    @Test
    public void logintest1() throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");

        //1.creates the object reference of takesscreenshots
        TakesScreenshot ts=(TakesScreenshot) driver;
        //2.call the method getscreenshotAs() using object reference of takes screenshots
        File srcFile=ts.getScreenshotAs(OutputType.FILE);

        //3.copy the  file object into a real image file
        FileUtils.copyFile(srcFile,new File("C:\\screenshots\\IMG.png"));
    }
}
