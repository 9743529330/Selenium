package TestNgDemoo.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classOneTest1(String var1,String var2,String var3)
    {
        String Url= var1;
        String Username=var2;
        String Password=var3;
        System.out.println("classOneTest1");
    }

    @Test
    public void  classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
