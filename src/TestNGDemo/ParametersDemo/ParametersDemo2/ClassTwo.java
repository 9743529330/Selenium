package TestNGDemo.ParametersDemo.ParametersDemo2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Parameters({"myUrl","username","password"})
    @BeforeClass

    public void beforeMyClass(String v1,String v2,String v3) {
        System.out.println("url: "+v1);
        System.out.println("user: "+v2);
        System.out.println("pass: "+v3);
        System.out.println("classOneTest1");
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
