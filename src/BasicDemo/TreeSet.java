package BasicDemo.CollectionsDemo;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<String> ts=new java.util.TreeSet<>();
        System.out.println(ts.isEmpty());//true
        ts.add("mohan");
        ts.add("kapoor");
        ts.add("suraj");
        ts.add("mamta");
        ts.add("amol");
        ts.add("pooja");
        ts.add("surya");
        ts.add("surya");
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains("suraj"));
        System.out.println(ts.isEmpty());//false

    }
}
