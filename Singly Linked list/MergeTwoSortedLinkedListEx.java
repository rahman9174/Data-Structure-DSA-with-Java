import java.util.*;

class MergeTwoSortedLinkedListEx{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of 1st linked list and 2nd linked list :  ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        System.out.println("enter sorted "+ size1 + " element : ");
        Node head1 = new Node(sc.nextInt());
        Node temp1 = head1;
        //insertNode(temp1,size1);
        while(size1 > 1){
            temp1.next = new Node(sc.nextInt());
            temp1 = temp1.next;
            size1--;
        }

        System.out.println("enter sorted "+ size2 + " element : ");
        Node head2 = new Node(sc.nextInt());
        Node temp2 = head2;
        //isertNode(temp2,size2);
        while(size2 > 1){
            temp2.next = new Node(sc.nextInt());
            temp2 = temp2.next;
            size2--;
        }
        temp1 = head1;
        temp2 = head2;
        System.out.println("first linked list : ");
        printList(temp1);
        
        System.out.println();
        System.out.println("Second linked list : ");
        printList(temp2);

        Node head = null;
        Node ans = null;

        while(temp1 != null && temp2 != null){
            if(temp1.x < temp2.x){
                if(head == null){
                    head = new Node(temp1.x);
                    ans = head;
                }
                else{
                    head.next = new Node(temp1.x);
                    head = head.next ;
                }
                temp1 = temp1.next;
            }
            else{
                if(head == null ){
                    head = new Node(temp2.x);
                    ans = head;
                }
                else{
                    head.next = new Node(temp2.x);
                    head = head.next;
                }
                temp2 = temp2.next;

            }
            if(temp1 != null ){
                head.next = temp1;
            }
            if(temp2 != null){
                head.next = temp2;
            }
        }
        System.out.println();
        System.out.println("The 2 sorted linked list after the merging :  ");
        printList(ans);
    }
    public static void printList(Node head){
        while(head != null){
            System.out.print(head.x+" ");
            head   = head .next;
        }
    }
   

}
class Node{
    int x;
    Node next;
    Node(int x ){
        this.x = x ;
        this.next = null;
    }
}