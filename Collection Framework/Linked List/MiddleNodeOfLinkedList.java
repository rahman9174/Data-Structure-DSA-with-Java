class MiddleNodeOfLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node slow = head;
        Node fast = head;

        while( slow != null && fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The middle node of the linked list is : "+slow.x);
    }
}