// Node class represents each node in the linked list
class LinkedListDemo {
    int data; // data part of the node
    Node next; // reference to the next node

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents the linked list
class LinkedList {
    Node head; // head of the list

    // Constructor to initialize the linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert an element at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Insert the new node at the end
        }
        System.out.println("Inserted " + data);
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If the node to be deleted is the head node
        if (head.data == data) {
            head = head.next; // Move the head to the next node
            System.out.println("Deleted " + data);
            return;
        }

        // Find the node to be deleted
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        // If the node is not found
        if (temp.next == null) {
            System.out.println("Node with data " + data + " not found!");
        } else {
            // Delete the node
            temp.next = temp.next.next;
            System.out.println("Deleted " + data);
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }
}

// Main class to test the Linked List implementation
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        // Display the linked list
        list.display();

        // Delete an element from the list
        list.delete(30);
        list.display();

        // Try to delete an element that is not present
        list.delete(60);

        // Display the list after deletion
        list.display();
    }
}
