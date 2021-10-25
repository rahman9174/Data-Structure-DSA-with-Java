//Generic collection --> only saame type of data can hold it 

import java.util.*;

class Collection5{
    public static void main(String[] args){
        Collection<Integer> values = new ArrayList<>();

        values.add(55);
       // values.add("Rahman"); // because we use the Generic collection so it takes the same type only data
       // values.add("TaRa");
        //values.add(88.44);
        //values.add(44.4f);
        values.add(3);
        values.add(5);
        values.add(44);
        values.add(22);

        Iterator i = values.iterator();

        while(i.hasNext()){
            System.out.print("With the help of iterator and while() loop ----  ");
            System.out.println(i.next());
        }

        for(Integer a : values){
            System.out.print("enhance for() loop---------------------   ");
            System.out.println(a);
        }

        for(int b : values){
            System.out.print("enhance for() loop---------------------   ");
            System.out.println(b);
        }
        values.remove(44);
        System.out.println("after remove  :    ");
        for(Integer a : values){
            System.out.print("enhance for() loop---------------------   ");
            System.out.println(a);
        }

        System.out.println("Pirnting element with the help of Lamda expression :   ");
        values.forEach(System.out::println);
    }
}