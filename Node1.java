public class Node {
    int data;       // Data for the node
    Node next;      // Reference to the next node

    // Constructor for Node
    public Node(int data) {
        this.data = data;  // Set the data for the node
        this.next = null;  // Initialize next as null
    }
}
public class LinkedListDemo {

    // Head of the linked list
    private Node head;

    // Method to add a new node at the end
    public void addNode(int data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If the list is empty, make newNode the head
        } else {
            Node current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Link the last node to the new node
        }
    }

    // Method to display the linked list
    public void displayList() {
        Node current = head;
        if (current == null) {
            System.out.println("The linked list is empty.");
        } else {
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");  // End of the list
        }
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();  // Create a new LinkedListDemo object

        // Add nodes to the linked list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Display the linked list
        System.out.println("Linked List:");
        list.displayList();
    }
}
