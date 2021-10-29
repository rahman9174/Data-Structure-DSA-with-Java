class InsertNewNodeAtTheBegining{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        Node newNode = new Node(50);

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        while(head != null){
            System.out.print(head.x+" ");
            head = head.next;
        }

    }
}
class Node{
    int x ;
    Node next;
    Node prev;
    Node(int x){
        this.x = x;
        this.next = null;
        this.prev = null;
    }
}