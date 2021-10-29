// In this programm we create doubly linked list and printing it from original linked list and the reversing of it.


public class DoublyLinkedList_2{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        Node temp = null;

        System.out.println("Linked list from the forword direction : ");
        while(head != null){
            System.out.print(head.x+" ");
            temp = head;
            head = head.next;
        }
        System.out.println("\nlinked list in the reverse direction : ");
        while(temp != null){
            System.out.print(temp.x+" ");
            temp = temp.prev;
        }

    }
}
class Node{
    int x;
    Node next ;
    Node prev ;
    Node(int x){
        this.x = x;
        this.next = null;
        this.prev = null;
    }
}