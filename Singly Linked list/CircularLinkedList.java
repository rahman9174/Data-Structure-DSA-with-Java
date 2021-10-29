// we will create the circular linked list
class CircularLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = head;// by this step we make the circular linked list

        Node temp = head;
        
        do{
            System.out.print(temp.x+" ");
            temp = temp.next;
        }while(temp != head);
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