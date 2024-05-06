package TestNGDemo.ParametersDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"myUrl","username","password"})

    @Test
    public void ClassThreeTest1(String v1,String v2,String v3) {
        System.out.println("url: "+v1);
        System.out.println("user: "+v2);
        System.out.println("pass: "+v3);
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
