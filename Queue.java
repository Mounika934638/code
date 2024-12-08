public class Queue {
    private int maxSize;   // Maximum size of the queue
    private int front;     // Front of the queue
    private int rear;      // Rear of the queue
    private int[] queue;   // Array to store queue elements
    private int size;      // Current size of the queue

    // Constructor to initialize the queue
    public Queue(int capacity) {
        maxSize = capacity;  // Set the maximum size of the queue
        queue = new int[maxSize];  // Create the queue array
        front = 0;                // Initially, the front is 0
        rear = -1;                // Initially, the rear is -1
        size = 0;                 // Initially, the size of the queue is 0
    }

    // Method to add an element to the queue (enqueue operation)
    public void enqueue(int value) {
        if (size == maxSize) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;  // Circular increment of the rear
            queue[rear] = value;           // Add the value to the queue
            size++;                        // Increase the size of the queue
            System.out.println(value + " enqueued to the queue.");
        }
    }

    // Method to remove an element from the queue (dequeue operation)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;  // Return -1 if the queue is empty
        } else {
            int value = queue[front];  // Get the front element
            front = (front + 1) % maxSize;  // Circular increment of the front
            size--;  // Decrease the size of the queue
            return value;
        }
    }

    // Method to peek at the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;  // Return -1 if the queue is empty
        }
        return queue[front];  // Return the front element
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == maxSize;
    }

    // Method to display all elements in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            int current = front;
            for (int i = 0; i < size; i++) {
                System.out.print(queue[current] + " ");
                current = (current + 1) % maxSize;  // Move to the next element (circular)
            }
            System.out.println();
        }
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        Queue queue = new Queue(5);  // Create a queue of capacity 5

        // Enqueue elements to the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Display the queue
        queue.displayQueue();

        // Try to enqueue an element to a full queue
        queue.enqueue(60);

        // Dequeue an element from the queue
        System.out.println(queue.dequeue() + " dequeued from the queue.");

        // Peek at the front element
        System.out.println("Front element is: " + queue.peek());

        // Display the queue again
        queue.displayQueue();

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Dequeue all elements from the queue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Display the queue after dequeuing all elements
        queue.displayQueue();
    }
}
