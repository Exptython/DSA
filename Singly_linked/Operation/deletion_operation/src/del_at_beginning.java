
class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        this.next=null;

    }
}


public class del_at_beginning {
        Node head;

        void delAtBeginning(){
            if (head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
        }

        void display(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.data+"-> ");
                temp=temp.next;
            }
            System.out.println("null");
        }

    static void main() {
        del_at_beginning list=new del_at_beginning();

       list.head=new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Before Deletion:");
        list.display();

        list.delAtBeginning();
        System.out.println("after deletion:");
        list.display();

    }

}
