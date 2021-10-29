
//In this program we add one node in the begining of the linkList
class LinkListNodeAtBegining{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        // Now we will add one node at the begining of the linkedList

        Node newHead = new Node(5);
        newHead.next = head;
        head = newHead;

        // now we can print the updated linked list
        System.out.print(" After adding node at the 1st postion , the link list is as : ");
        while(head != null ){
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
        next = null ;
    }
}