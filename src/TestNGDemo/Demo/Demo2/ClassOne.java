package TestNGDemo.Demo.Demo2;

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
    @Test  //(groups = "test pass")
    public void classOneTest1() {
        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2() {
        System.out.println("classOneTest2");
    }

    @Test(groups = "test pass")
    public void classOneTest3() {
        System.out.println("classOneTest3");
    }
}
