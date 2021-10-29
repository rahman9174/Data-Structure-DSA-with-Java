class InsertNewNodeAtTheKthLocation{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        int add = 2;
        int count = 1;
        Node temp = head ;
        while(count != add-1){
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(50);
        // if(add == 1){
        //     newNode.next = head;
        //     head.prev = newNode;
        //     head = newNode;
            
        // }
       // else{
        newNode.next = temp.next ;
        temp.next = newNode;
        newNode.prev = temp ;
        newNode.next.prev = newNode;
       // }

        while(head != null ){
            System.out.print(head.x+" ");
            head = head.next;
        }

    }
}
class Node{
    int x ;
    Node next ;
    Node prev;
    Node(int x){
        this.x = x;
        this.next = null ;
        this.prev = null;
    }
}