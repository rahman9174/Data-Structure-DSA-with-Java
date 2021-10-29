// In this progrom we will chech that a given linked list is palindrom or not 
import java.util.*;
class LinkedListIsPalindromOrNot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many nodes you want to create : ");
        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());

        Node temp = head;

        while(n>1){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
            n--;
        }
        System.out.print("the original  linked list is : ");
        temp = head;

        while(temp != null){
            System.out.print(temp.x+" ");
            temp = temp.next;
        }
        //Now we check that given linked list is palindrom or not
        Stack<Integer> stack = new Stack<Integer>();
        temp = head;
        while(temp != null){
            stack.push(temp.x);
            temp = temp.next;
        }
        boolean isPalindrom = true;
        while(head != null){
            int i = stack.pop();
            if(head.x == i){
                isPalindrom = true;
            }
            else{
                isPalindrom = false;
                break;
            }
            head = head.next;

        }
        System.out.println("Given linked list is palindrom or no : "+isPalindrom);


    }
}
class Node{
    int x;
    Node next;
    Node(int x){
        this.x = x;
        this.next = null;
    }
}