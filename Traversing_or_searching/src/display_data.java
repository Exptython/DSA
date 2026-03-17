class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class display_data {
    Node head;

    void display(){
        Node temp=head;

        if (temp==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> " );
            temp=temp.next;
        }
        System.out.println("null");
    }
    void insert(int data){
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

    static void main() {
        display_data list=new display_data();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}
