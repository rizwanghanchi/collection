package collection;

import java.util.*;

public class ListIteratorDemo {
    
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("rizzu");
        l.add("sohil");
        l.add("viram");
        l.add("akash");
        l.add("bvm");
        System.out.println(l);
        
        ListIterator i=l.listIterator();
        
        while(i.hasNext()){
            String s=(String)i.next();
            if(s.equals("sohil")){
                i.remove();
            }
            else if(s.equals("viram")){
                i.add("vadodara");
            }
            else if(s.equals("akash")){
                i.set("singh");
            }else if(s.equals("sohil")){
                i.set("bapu");
            }
        }
        System.out.println("lst : "+l);
    }
}
