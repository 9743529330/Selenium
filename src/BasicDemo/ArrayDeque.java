package BasicDemo.CollectionsDemo;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<String> adq=new java.util.ArrayDeque<>();
        adq.offer("mohan");
        adq.offer("amol");
        adq.offer("amit");
        adq.offer("surya");
        adq.offer("sathya");
        adq.offer("raju");
        adq.offer("pooja");
        adq.offer("tripathi");
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq);

    }
}
