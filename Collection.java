
package collection;

import java.util.*;


public class Collection {

    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("a");
        l.add(10);
        l.add(20);
        l.add("ok");
        System.out.println(l);
        l.remove(2);
        l.add(2,100);
        l.add(null);
        ArrayList l2=new ArrayList();
        l2.add(120);
        
        l2.add(l);
        System.out.println(l2);
        
    }
    
}
