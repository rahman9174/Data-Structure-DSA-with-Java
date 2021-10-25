import java.util.*;

class Collection2{
    public static void main(String[] args){
        Collection values = new ArrayList();

        values.add(1);
        values.add(2.2);
        values.add("Rahman");

        Iterator i = values.iterator();
        System.out.println("First : "+i.next());
        System.out.println("Second : "+i.next());
        System.out.println("Third : "+i.next());


    }
}