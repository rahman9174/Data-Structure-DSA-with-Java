class MergeTwoSortedLinkedList{
    public static void main(String[] args){
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        //head1.next.next.next = new Node(40);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);

        Node temp1 = head1;
        Node temp2 = head2;

        printList(temp1);
        printList(temp2);

        // while(temp1 != null){
        //     System.out.print(temp1.x+" ");
        //     temp1 = temp1.next;
        // }
        Node head = null;
        Node ans = null;

        while(temp1 != null && temp2 != null){
            if(temp1.x < temp2.x){
                if(head == null){
                    head = new Node(temp1.x);
                    ans = head;
                }
                else{
                    head.next = new Node(temp1.x);
                    head = head.next;
                }
                temp1 = temp1.next;
            }
            else{
                if(head == null){
                    head = new Node(temp2.x);
                    ans = head;
                }
                else{
                    head.next = new Node(temp2.x);
                    head = head.next;
                }
                temp2 = temp2.next;
            }
            if(temp1 != null){
                head.next = temp1;
            }
            if(temp2 != null){
                head.next = temp2;
            }
        }
        System.out.print("afer merging the both linked list : ");
        printList(ans);
    }
    public static void printList(Node head){
        while(head != null){
            System.out.print(head.x+" ");
            head = head.next;
        }
        System.out.println();
    }
}