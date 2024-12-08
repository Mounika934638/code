import java.util.LinkedList;

class CustomHashMap {
    
    // Node class to represent each key-value pair
    private class Node {
        int key;
        int value;
        
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    // Array to store linked lists (buckets)
    private LinkedList<Node>[] table;
    private static final int SIZE = 16; // Default size of the HashMap
    
    // Constructor to initialize the table
    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }
    
    // Hash function to compute the index of the bucket
    private int hash(int key) {
        return key % SIZE;
    }
    
    // Method to put a key-value pair into the map
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];
        
        // Check if the key already exists and update the value
        for (Node node : bucket) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        
        // If the key doesn't exist, create a new node and add it to the bucket
        bucket.add(new Node(key, value));
    }
    
    // Method to get the value associated with a key
    public Integer get(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];
        
        // Search for the key in the bucket
        for (Node node : bucket) {
            if (node.key == key) {
                return node.value;
            }
        }
        
        // Return null if key is not found
        return null;
    }
    
    // Method to remove a key-value pair from the map
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];
        
        // Search for the key and remove it if found
        for (Node node : bucket) {
            if (node.key == key) {
                bucket.remove(node);
                return;
            }
        }
    }
    
    // Method to display the contents of the HashMap
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (!table[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Node node : table[i]) {
                    System.out.print("(" + node.key + ", " + node.value + ") ");
                }
                System.out.println();
            }
        }
    }
}

// Main method that was previously in the HashMapDemo class
public class CustomHashMapTest {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        
        // Adding key-value pairs
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        
        // Display the HashMap
        map.display();
        
        // Get values for keys
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 3: " + map.get(3));
        
        // Removing a key-value pair
        map.remove(2);
        System.out.println("After removing key 2:");
        map.display();
        
        // Try to get a removed key
        System.out.println("Value for key 2 after removal: " + map.get(2));
    }
}
