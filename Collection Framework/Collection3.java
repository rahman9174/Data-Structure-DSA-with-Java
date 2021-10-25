import java.util.*;

class Collection3{
    public static void main(String[] args){
        Collection values = new ArrayList();

        values.add(4);
        values.add(10.0);
        values.add("Rahman");

        Iterator i = values.iterator();

        while(i.hasNext()){
            System.out.print(i.hasNext()+" -->  ");
            System.out.println(i.next());
        }
    }
}