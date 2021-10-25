import java.util.*;
class Test1{
    public static void main(String [] args){
        //create arrayList
        ArrayList<String> list = new ArrayList<String>();// creating arrayList

        list.add("ravi");//addding object in arrayList
        list.add("kavi");
        list.add("sabita");
        list.add("babita");
        list.add("kabita");

        System.out.println(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}