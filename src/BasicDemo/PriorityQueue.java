package BasicDemo.CollectionsDemo;

public class PriorityQueue {
    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(20);
        pq.offer(65);
        pq.offer(85);
        pq.offer(15);
        pq.offer(45);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
