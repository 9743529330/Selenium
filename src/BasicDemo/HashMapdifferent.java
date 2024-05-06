package BasicDemo.CollectionsDemo;

import java.util.HashMap;

public class HashMapdifferent {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"amit");
        hm.put(102,"amol");
        hm.put(103,"aap");
        hm.put(104,"sohan");
        hm.put(106,"tripathi");
        System.out.println("hm="+hm);
        HashMap<Integer,String> hm2=new HashMap<>();
        System.out.println("hm2="+hm2);
        hm2.putAll(hm);
        System.out.println("hm2="+hm2);
        System.out.println(hm2.containsKey(103));
        hm2.remove(103);
        System.out.println(hm2);
        System.out.println(hm2.containsKey(103));
    }
}
