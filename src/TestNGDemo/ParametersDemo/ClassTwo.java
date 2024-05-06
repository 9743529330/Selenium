package TestNGDemo.ParametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Parameters({"myUrl","username","password"})
    @Test
    public void classtwoTest1(String v1,String v2,String v3) {
        System.out.println("url: "+v1);
        System.out.println("user: "+v2);
        System.out.println("pass: "+v3);
        System.out.println("classtwoTest1");
    }

    @Test
    public void classtwoTest2() {
        System.out.println("classtwoTest2");
    }

    @Test
    public void classtwoTest3() {
        System.out.println("classtwoTest3");
    }
}
