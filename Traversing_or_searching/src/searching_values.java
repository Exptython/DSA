public class searching_values {
    Node head;

    boolean search(int key){
        Node temp=head;

        while(temp!=null){
            if (temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        searching_values list=new searching_values();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        int key=20;

        if (list.search(key)){
            System.out.println("value found");
        }else {
            System.out.println("value not found");
        }

    }
}
