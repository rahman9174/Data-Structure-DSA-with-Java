// In this program we will add one new Node at the end of the link list 

class LinkListNodeAtEnd{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Now we add the node at the end of the link list
        Node newNode = new Node(90);

        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;

        while(head != null){
            System.out.print(head.x + " ");
            head = head.next;
        }

    }
}
class Node{
    int x ;
    Node next;
    Node(int x ){
        this.x= x ;
       // next = null;
    }
}