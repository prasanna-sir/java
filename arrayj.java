import java.util.*;
public class arrayj {
    public static void main (String[] args){
        Arraylist I=new Arraylist();
        I.add("A");
        I.add(10);
        I.add("A");
        I.add(null);
        System.out.println(I);
        I.remove(2);
        System.out.println(I);
        I.add(2,"M");
        I.add("N");
        System.out.println(I);
    }
    
}
