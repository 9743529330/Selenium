package BasicDemo.CollectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"amol");
        hm.put(102,"true");
        hm.put(103,"solve");
        hm.put(104,"value");
        hm.put(105,"somya");
        hm.put(106,"rahul");
        System.out.println(hm);
        Set s=hm.keySet();
        Collection values=hm.values();
        System.out.println("keys="+s);
        System.out.println("values="+values);
        hm.entrySet();
        System.out.println(hm.entrySet());
        Set s2=hm.entrySet();
        System.out.println("entry set="+s2);




    }
}
