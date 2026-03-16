







public class insert_at_end {
    Node head;

    void insertAtEnd(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> " );
            temp=temp.next;
        }
        System.out.println("null");
    }

    static void main() {
        insert_at_end list=new insert_at_end();

        list.insertAtEnd(10);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(20);

        list.display();



    }



    }

