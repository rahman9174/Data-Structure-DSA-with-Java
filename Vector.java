import java.util.Vector;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
class Vector {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<Integer>();
        
        // add element in vector using vector method as vector.add(element )
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);

        Iterator it = vector.iterator();
        System.out.println(vector);
        System.out.println("vector elements are  :");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}