package TestNGDemo.ParametersDemo.Demo6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

        @Parameters({"myUrl","myUsername","myPassword"})
        @Test
        public void classThreeTest1(String var1,String var2,String var3)
        {
            String url=var1;
            String username=var2;
            String password=var3;
            System.out.println("classThreeTest1");

        }

        @Test
        public void classThreeTest2()
        {
            System.out.println("classThreeTest2");
        }
    }


