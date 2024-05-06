package TestNGDemo.DemoListners;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {

    @Test
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
        Assert.assertEquals(true,false,"this test is failed");
    }

}
