class ReverseLinkedList{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next =new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node temp = head;
        System.out.print("original linked list : ");
        while(temp != null){
            System.out.print(temp.x+" ");
            temp = temp.next;
        }

        Node prev = null ;
        Node cur = head;
        Node next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev ; 
            prev = cur;
            cur = next;
        }
        head = prev ;
        System.out.println();
        System.out.println("after reverse the linked list : ");

        while(head != null){

            System.out.print(head.x+" ");
            head = head.next;
        }
  
    }
}
class Node{
    int x ;
    Node next ; 
    Node(int x ){
        this.x = x ;
        this.next  = null;
    }
}