class LinkList1{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);   

        while(head != null){
            System.out.print(head.x+" ");
            head = head.next;
        }

        
    }
    
}
class Node{
    int x;
    Node next;
    Node(int x){
        this.x = x;
        next = null;
    }
}