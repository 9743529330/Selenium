package TestNGDemo.Demo.Demo3.Demo2;

import org.testng.annotations.Test;

public class ClassThree {
   /* @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }
    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }*/
   @Test
   public void Parameters()
   {
       String url="http://gmail.com";
       String user="url-1";
       String pass="pass-1";
       System.out.println("url:="+url);
       System.out.println("user="+user);
       System.out.println("pass="+pass);

   }
    @Test //(groups = "emails")
    public void classthreeTest1() {
        System.out.println("classThreeTest1");
    }

    @Test //(groups = "test pass")
    public void classthreeTest2() {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classthreeTest3() {
        System.out.println("classThreeTest3");
    }
}
