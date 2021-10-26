// In this programm we will find the intersection point of given 2 linked list

class InsertionOfTwoLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new  Node(5);
        head1.next.next.next.next.next = new Node(6);

        head1.next.next.next.next.next.next = head.next.next.next;


        Node temp = head;
        Node temp1 = head1;

        int l1 = getLength(temp);
        int l2 = getLength(temp1);

        System.out.println(" Length of first linked list l1  : "+l1);
        System.out.println(" Length of second linked list  Len2 : "+l2);

        if(l1 > l2){
            int diff = l1 - l2;
            while(temp !=null && diff>0){
                temp = temp.next;
                diff--;
            }
        }
        else{
            int diff = l2 - l1;
            while(temp1 != null && diff > 0){
                temp1 = temp1.next;
                diff--; 
            }
        }
        while(temp != null && temp1 != null){
            if(temp == temp1){
             System.out.println("Intersection point is "+ temp.x);
              return;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        System.out.println("Intersection point is : "+temp.x);

    }
    public static int getLength(Node head){
        int len = 0 ;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
class Node{
    int x;
    Node next ;
    Node(int x){
        this.x = x;
        this.next = null;
    }
}