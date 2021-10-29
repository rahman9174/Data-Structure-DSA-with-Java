// In this program we take the input from the user at the run time and will create the linked list

import java.util.*;
import java.io.*;
class LinkedListUsingCustomInput{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" How many linked list node you want to create : ");
        int n = sc.nextInt();
        
        // creating the first node with first input
        Node head = new Node(sc.nextInt());

        Node temp = head ;

        //taking input and creating the remaing nodes
        while(n>1){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            n--;

        }
        // printing the linked list'
        System.out.println(" The linked list is shown in below : ");
        while(head != null){
            System.out.print(head.x+" ");
            head = head.next;
        }

    }
}
 class Node{
    int x ;
    Node next;
    Node(int x){
        this.x = x ;
        this.next = null;
    }
}