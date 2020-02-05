package collection;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack ss=new Stack();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(10);
        ss.push(20);
        ss.push(40);
       
        System.out.println(ss);
        System.out.println(ss.search(10));
        System.out.println(ss.pop());
        System.out.println(ss);
        
    }
}
