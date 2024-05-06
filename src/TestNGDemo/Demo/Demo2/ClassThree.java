package TestNGDemo.Demo.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
   /* @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }
    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }*/
    @Test //(groups = "emails")
    public void classthreeTest1() {
        System.out.println("classThreeTest1");
    }

    @Test (groups = "test pass")
    public void classthreeTest2() {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classthreeTest3() {
        System.out.println("classThreeTest3");
    }
}
