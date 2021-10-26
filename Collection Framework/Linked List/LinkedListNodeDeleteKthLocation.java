class LinkedListNodeDeleteKthLocation{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int k = 3;// deleting location index

        int count = 1;

        

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
        this.x = x;
        this.next = null;
    }
}