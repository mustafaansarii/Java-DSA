// Node class representing each element in the linked list
class Node {
    int data;  // Data to store in the node
    Node next; // Reference to the next node

    // Constructor to create a new node with the given data
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}

// Singly Linked List class
public class SinglyLinkedList {
    private Node head; // Head node of the linked list

    // Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Link new node to the current head
        head = newNode;      // Update head to the new node
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If the list is empty, make newNode the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Link the last node to the new node
        }
    }

    // Insert a new node at a specific position in the list
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a node by its value
    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next; // If head needs to be deleted
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        previous.next = current.next; // Unlink the node from the list
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the Singly Linked List implementation
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert nodes into the list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);

        System.out.println("Linked List after insertion:");
        list.display();

        // Delete nodes from the list
        list.deleteByValue(15);
        list.deleteByValue(5);

        System.out.println("Linked List after deletion:");
        list.display();
    }
}
