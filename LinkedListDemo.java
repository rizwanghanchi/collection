package collection;

import java.util.*;

class Student{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
        ll.add("rizzu");
        ll.add(20);
        ll.add(null);
        System.out.println(ll);
        ll.addLast("rizwan");
        ll.set(0,"vadodara");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        
        Student s=new Student(1,"rizzu bhai");
        Student s1=new Student(2,"rizwan");
        LinkedList<Student> std=new LinkedList();
        std.add(s1);
//        std.add(10);
//        std.add(s.name);
        
        System.out.println(std.get(0).rollno);
        System.out.println("size: "+std.size());
    }
           
}
