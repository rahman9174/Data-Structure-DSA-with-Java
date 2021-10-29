class LoopLinkedList{
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        boolean isLoopPresent = false;

        Node slow = head ;
        Node fast = head ;

        while(slow != null && fast != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isLoopPresent = true;
                break;
            }
        }
        System.out.println(" Is loop present in the linked list : "+isLoopPresent);
    }
}