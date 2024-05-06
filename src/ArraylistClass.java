import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistClass {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(60);
        al.add(85);
        al.add(96);
        al.add(25);
        al.add(26);
        al.add(45);
        al.add(45);
        al.add(45);
        al.add(45);
        al.add(45);
        System.out.println("arraylist="+al);
        System.out.println("size="+al.size());
        System.out.println("capacity="+al);
        Iterator itr=al.iterator();
        while (itr.hasNext())
            System.out.print(" "+itr.next());

    }
}
