class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class insert_at_beg {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void traverse() {
        Node temp = head;

        if (temp == null) {
            System.out.println("list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        System.out.println("null");
    }


    static void main() {
        insert_at_beg list = new insert_at_beg();
        list.insertAtBeginning(10);
        list.insertAtBeginning(30);
        list.insertAtBeginning(50);

        list.traverse();
    }


}



