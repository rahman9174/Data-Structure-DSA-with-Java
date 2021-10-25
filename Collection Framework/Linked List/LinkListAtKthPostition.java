class LinkListAtKthPostition{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int k = 3;
        Node newNode = new Node(5);
        Node temp = head ;
        int count = 1;
        while(temp != null && count < k-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        this.next = null;
    }
}