package TestNGDemo.Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void ClassThreeTest1(String var1,String var2,String var3)
    {
        String url=var1;
        String username=var2;
        String password=var3;
        System.out.println("url:"+var1);
        System.out.println("username:"+var2);
        System.out.println("password:"+var3);
        System.out.println("ClassThreeTest1");

    }
    @Test
    public void ClassThreeTest2()
    {
        System.out.println("ClassThreeTest2");
    }
    @Test
    public void ClassThreeTest3()
    {
        System.out.println("ClassThreeTest3");
    }
}

