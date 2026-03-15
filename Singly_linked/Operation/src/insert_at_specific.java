public class insert_at_specific {
    Node head;

    void insertAtSpecificPosition(int data,int position){
        Node newNode=new Node(data);

        if (position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for (int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;

    }

        if (temp==null){
            System.out.println("invalid position");
            return;
        }
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
        insert_at_specific list=new insert_at_specific();
        list.insertAtSpecificPosition(20,1);
        list.insertAtSpecificPosition(20,2);
        list.insertAtSpecificPosition(30,3);

        list.display();
    }

    }