public class Reversing_linked {
    Node head;

    void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;

        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head prev;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
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
        Reversing_linked list=new Reversing_linked();
        list.insert(30);
        list.insert(20);
        list.insert(10);

        System.out.println("before: ");
        list.display();

        list.reverse();

        System.out.print("after");
        list.display();

    }
}
