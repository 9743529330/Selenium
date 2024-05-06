package BasicDemo.CollectionsDemo;

import java.util.HashSet;

public class HashSetdemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("mohan");
        hs.add("sohan");
        hs.add("amol");
        hs.add("amit");
        hs.add("pooja");
        hs.add("kapoor");
        hs.add("kapoor");
        System.out.println(hs);
        System.out.println(hs.size());
       System.out.println(hs.contains("tripathi"));
       System.out.println(hs.clone());
       System.out.println(hs.remove("pooja"));
       System.out.println(hs);

    }
}
