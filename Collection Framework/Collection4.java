import java.util.*;

class Collection4{
    public static void main(String[] args){
        Collection values = new ArrayList();

        values.add(5);
        values.add(1.1);
        values.add("Rahman");
        values.add(8.3f);

        //Enhance for() loop 
        for(Object i : values){
            System.out.println(i);
        }
    }
}