package TestNGDemo.ParametersDemo.Demo6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

        @Parameters({"myUrl","myUsername","myPassword"})
        @Test
        public void classTwoTest1(String var1, String var2, String var3) {
            String url = var1;
            String username = var2;
            String password = var3;
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

