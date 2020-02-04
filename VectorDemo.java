package collection;

import java.util.*;
/**
 *
 * @author Rizwan Khan
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector c=new Vector(10,2);
        System.out.println("initial capacity : "+c.capacity());
        
        for(int i=0;i<11;i++){
            c.addElement(i);
        }
        System.out.println("capacity : "+c.capacity());
        
        
    }
}
