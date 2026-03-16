public class del_at_end {
    Node head;

    void delAtEnd(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    static void main() {
        del_at_end list=new del_at_end();
        list.head=new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);


        System.out.println("Before deletion:");
        list.display();

        list.delAtEnd();

        System.out.println("After deletion:");
        list.display();
    }
}
