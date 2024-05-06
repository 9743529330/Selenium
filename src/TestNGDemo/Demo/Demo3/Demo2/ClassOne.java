package TestNGDemo.Demo.Demo3.Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {
    @BeforeTest
    public void myBeforeTest()
    {
        System.out.println("myBeforeTest");
    }
    @AfterTest
    public  void myAfterTest()
    {
        System.out.println("myafterTest");
    }
    @Test
    public void Parameters()
    {
        String url="http://facebook.com";
        String user="url-1";
        String pass="pass-1";
        System.out.println("url:="+url);
        System.out.println("user="+user);
        System.out.println("pass="+pass);

    }
    @Test  //(groups = "test pass")
    public void classOneTest1() {
        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2() {
        System.out.println("classOneTest2");
    }

    @Test//(groups = "test pass")
    public void classOneTest3() {
        System.out.println("classOneTest3");
    }
}
