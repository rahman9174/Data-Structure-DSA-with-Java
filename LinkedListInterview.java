class LinkedListInterview{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Int n = sc.nextInt();
        Node head = null;

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            Node newNode = new Node(a);
            newNode.next = null;

            if(head == null){
                head = newNode;
            }
            else{
                Node last = head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = newNode;
            }
        }
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