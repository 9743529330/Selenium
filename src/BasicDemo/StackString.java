package BasicDemo.CollectionsDemo;

import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("ramesh");
        s.push("mohan");
        s.push("value");
        s.push("aadhya");
        s.push("pooja");
        s.push("tripathi");
        s.push("kajool");
        System.out.println("stack="+s);
       // s.pop();
        System.out.println(s.pop());
        System.out.println(s);
    }
}
