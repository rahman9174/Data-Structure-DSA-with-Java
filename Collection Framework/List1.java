import java.util.*;
class List1{
    public static void main(String [] args){
        List lst = new ArrayList();
        lst.add(1);
        lst.add(44.3);
        lst.add("Rahman");
        lst.add(44.4f);

        System.out.println();
        System.out.println();
        System.out.println("Direct printing the list element : " +lst);

        System.out.println();
        System.out.println();
        System.out.println("With the help of Iterator we can also print : ");
        Iterator i = lst.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+"   ");
        }


        System.out.println();
        System.out.println();
        System.out.println("With the help of lemda function : ");
        lst.forEach(System.out::println);
    }
}