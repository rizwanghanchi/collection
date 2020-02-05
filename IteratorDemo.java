package collection;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        
        for(int i=0;i<11;i++){
            al.add(i);
        }
        System.out.println(al);
        
        Iterator i=al.iterator();
        int p=0;
        while(i.hasNext()){
            Integer ii=(Integer)i.next();
            
            if(ii%2==0){
                System.out.println("odd : "+ii);
            }else{
                System.out.println("size : "+al.get(p));
                i.remove();
                System.out.println("size rm : "+al.get(p));
            }
            p++;
        }
        
    }
}
