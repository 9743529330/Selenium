package TestNGDemo.Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void ClassOneTest1(String var1,String var2,String var3)
    {
        String Url=var1;
        String Username=var2;
        String Password=var3;
        System.out.println("url:"+var1);
        System.out.println("username:"+var2);
        System.out.println("password:"+var3);
        System.out.println("ClassOneTest1");
    }
    @Test
    public void ClassOneTest2()
    {
        System.out.println("ClassOneTest2");
    }
    @Test
    public void ClassOneTest3()
    {
        System.out.println("ClassOneTest3");
    }
}
