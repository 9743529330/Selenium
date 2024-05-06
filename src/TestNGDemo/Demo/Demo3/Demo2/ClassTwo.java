package TestNGDemo.Demo.Demo3.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassTwo {
   /* @BeforeTest
    public void BeforeMyTest()
    {
        System.out.println("BeforeMyTest");
    }
    @AfterTest
    public void AfterMyTest()
    {
        System.out.println("AfterMyTest");
    }*/
    @BeforeSuite
    public  void BeforeMySuite()
    {
        System.out.println("BeforeMySuite");
    }
    @AfterSuite
    public void AfterMysuite()
    {
        System.out.println("AfterMysuite");
    }
    @Test
    public void Parameters()
    {
        String url="http://youtube.com";
        String user="url-1";
        String pass="pass-1";
        System.out.println("url:="+url);
        System.out.println("user="+user);
        System.out.println("pass="+pass);

    }
    @Test
    public void classtwoTest1() {
        System.out.println("classtwoTest1");
    }

    @Test
    public void classtwoTest2() {
        System.out.println("classtwoTest2");
    }

    @Test //(groups="test pass")
    public void classtwoTest3() {
        System.out.println("classtwoTest3");
    }
}