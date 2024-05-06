package BasicDemo.CollectionsDemo;

import java.util.Stack;

public class StackIntegerDemo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(50);
        s.push(58);
        s.push(75);
        s.push(69);
        s.push(63);
        s.push(68);// remove last one
        System.out.println("stack="+s);
       // s.pop();
        System.out.println(s.pop());
        System.out.println(s);
    }
}
