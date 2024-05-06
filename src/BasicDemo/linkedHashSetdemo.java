package BasicDemo.CollectionsDemo;

import java.util.HashSet;

public class linkedHashSetdemo {
    public static void main(String[] args) {
        HashSet<String> lhs=new HashSet<>();
        lhs.add("mohan");
        lhs.add("sohan");
        lhs.add("amol");
        lhs.add("amit");
        lhs.add("pooja");
        lhs.add("kapoor");
        lhs.add("kapoor");
        System.out.println(lhs);
        System.out.println(lhs.size());
       System.out.println(lhs.contains("tripathi"));
       System.out.println(lhs.clone());
       System.out.println(lhs.remove("pooja"));
       System.out.println(lhs);

    }
}
