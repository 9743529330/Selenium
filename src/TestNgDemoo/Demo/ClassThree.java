package TestNgDemoo.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String var1,String var2,String var3)
    {
        String Url=var1;
        String Username=var2;
        String Password=var3;
        System.out.println("classThreeTest1");

    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
