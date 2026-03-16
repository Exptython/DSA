public class insert_after_node {
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
    void insertAfterGivenNode(int afterData,int newData){
        Node temp=head;

        while(temp!=null && temp.data!=afterData){
            temp=temp.next;
        }
        if (temp==null){
            System.out.println("given node not found");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=temp.next;
        temp.next=newNode;
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
        insert_after_node list=new insert_after_node();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);


        list.insertAfterGivenNode(20, 25);

        list.display();
    }
}
