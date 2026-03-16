public class del_at_specNode {
    Node head;

    void delAtSpecNode(int pos){
        if (head==null){
            System.out.println("list is empty");
            return;

        }
        if (pos ==1){
            head=head.next;
            return;
        }
        Node temp=head;

        for (int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    static void main() {
        del_at_specNode list=new del_at_specNode();
        list.head=new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before deletion:");
        list.display();

        list.delAtSpecNode(3);
        System.out.println("after deletion");
        list.display();


    }
}
