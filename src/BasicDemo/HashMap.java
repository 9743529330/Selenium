package BasicDemo.CollectionsDemo;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap hs=new java.util.HashMap();
        hs.put(101,"mohan");
        hs.put(102,"mamta");
        hs.put(103,"amit");
        hs.put(104,"mithlesh");
        hs.put(105,"amol");
        hs.put(106,"null");
        hs.put(null,null);// heterogenus elements are allowed.
        hs.put(null,null);// null is allowed only once and values are many times.
       //heterogeneous records
        hs.put("key",106);
        hs.put("mahavir",101);
        hs.put("key","key");
        hs.put(101,101);
        hs.put(108,"null");
        System.out.println(hs);



    }
}
