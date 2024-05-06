package TestNGDemo.Real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tutorialsites extends Base{


    @Test(priority = 4)
    public void ScriptingLogin()
    {
        driver.get("http://scriptinglogic.org/");
    }
    @Test(priority = 5)
    public void JavaTpoint()
    {
        driver.get("http://javaTpoint.com");
    }
    @Test(priority = 3)
    public void W3SchoolLogin()
    {
        driver.get("http://w3school.com");
    }
    @Test(priority = 2)
    public void TutorialsLogin()
    {
        driver.get("http://tutorialspoints.com");
    }
    @Test(priority = 1)
    public void CucumberLogin()
    {
        driver.get("http://cucumber/.com");
    }

}
