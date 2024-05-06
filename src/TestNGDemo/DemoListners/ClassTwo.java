package TestNGDemo.DemoListners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {
    @Test
    public void classtwoTest1() {
        System.out.println("classtwoTest1");
    }

    @Test
    public void classtwoTest2() {
        System.out.println("classtwoTest2");
        Assert.assertEquals(true,false,"this test is failed");
    }

    @Test
    public void classtwoTest3() {
        System.out.println("classtwoTest3");
    }
}
