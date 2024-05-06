package TestNGDemo.Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
    @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }
    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }
    @Test(groups = "emails")
    public void classthreeTest1() {
        System.out.println("classOneTest1");
    }

    @Test
    public void classthreeTest2() {
        System.out.println("classOneTest2");
    }

    @Test
    public void classthreeTest3() {
        System.out.println("classOneTest3");
    }
}
