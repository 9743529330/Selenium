package BasicDemo.CollectionsDemo;

import java.util.PriorityQueue;

public class PriorityQueueString {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("amol");
        pq.offer("mohan");
        pq.offer("sohan");
        pq.offer("raju");
        pq.offer("kapoor");
        pq.offer("sridhar");
        pq.offer("pooja");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
