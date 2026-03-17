public class updating_and_modifying {
    Node head;


    void update(int oldValue,int newValue){
        Node temp=head;

        while(temp!=null){
            if (temp.data==oldValue){
                temp.data=newValue;
                return;
            }
            temp=temp.next;
        }
        System.out.println("value not found");
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert for testing
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void main() {
        updating_and_modifying list=new updating_and_modifying();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("before: ");
        list.display();

        list.update(10,100);

        System.out.print("after: ");
        list.display();
    }
}
