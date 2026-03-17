public class count_nodes {
    Node head;

    int countNodes(){
        int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
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
        count_nodes list=new count_nodes();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        int total=list.countNodes();
        System.out.println("total nodes: "+total);
    }
}
