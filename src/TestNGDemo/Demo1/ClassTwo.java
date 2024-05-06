package TestNGDemo.Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void ClasstwoTest1(String var1,String var2,String var3)
    {
        String Url=var1;
        String Username=var2;
        String Password=var3;
        System.out.println("url:"+var1);
        System.out.println("username:"+var2);
        System.out.println("password:"+var3);
        System.out.println("ClassTwoTest1");

    }
    @Test
    public void ClassTwoTest2()
    {
        System.out.println("ClassTwoTest2");
    }
    @Test
    public void ClassTwoTest3()
    {
        System.out.println("ClassTwoTest3");
    }
}
