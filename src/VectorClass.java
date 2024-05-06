import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(210);
        v.add(136);
        v.add(156);
        v.add(140);
        v.add(160);
        v.add(180);
        v.add(210);
        v.add(160);
        v.add(160);
        v.add(160);
        v.add(160);
        System.out.println("vector="+v);
        System.out.println("capacity="+v.capacity());
        System.out.println("size="+v.size());
       /* Iterator itr=v.iterator();
        while (itr.hasNext())
            System.out.print(" "+itr.next()); */
        Enumeration e=v.elements();
        while (e.hasMoreElements())
            System.out.print(" "+e.nextElement());

    }
}
