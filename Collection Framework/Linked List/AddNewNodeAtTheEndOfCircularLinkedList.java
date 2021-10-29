class AddNewNodeAtTheEndOfCircularLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = head;

        Node newNode = new Node(100);
        newNode.next = head;

        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.next != head);
        
        temp.next = newNode;

        head = newNode;
        temp = head;
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