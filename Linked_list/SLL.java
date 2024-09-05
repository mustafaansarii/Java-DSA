class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    private Node head;

    public SLL() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;

        } else {
            new_node.next = this.head;
            this.head = new_node;
        }
    }

    public void display() {
        Node n = this.head;
        if (n == null) {
            System.out.println("[]");

        }
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node new_Node = new Node(data);
        if (position < 0) {
            throw new IndexOutOfBoundsException("Enter A valid Position!");
        }
        if (position == 0) {
            if (head == null) {
                head = new_Node;
            } else {
                new_Node.next = head;
                head.next = new_Node;
            }
        } else {
            Node n = head;
            for (int i = 0; n != null && i < position - 1; i++) {
                n = n.next;
            }
            if (n == null) {
                throw new IndexOutOfBoundsException("Enter A valid Position!");
            }else{
            new_Node.next = n.next;
            n.next = new_Node;
            }
        }
    }

    public void reverse(){
        if (head==null) {
            return;
        }
        Node n=head;
        Node prev=null;
        while (n!=null) {
            Node temp=n.next;
            n.next=prev;
            prev=n;
            n=temp;
        head=prev;
        }
    }

    public void deleteByValue(int value){
        if (head==null) {
            System.out.println("SLL is Empty!");
        }
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(20);
        sll.insertAtBeginning(30);
        sll.display();
        System.out.println();
        sll.reverse();
        sll.display();
        System.out.println();

    }
}
