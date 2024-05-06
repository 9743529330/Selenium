package TestNgDemoo.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void ClassTwoTest1(String var1, String var2, String var3) {
        String Url=var1;
        String Username=var2;
        String Password=var3;
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTw0Test2() {
        System.out.println("classTwoTest");
    }

    @Test
    public void classTwoTest3(){
        System.out.println("classTwoTest3");
}
}
