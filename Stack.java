public class Stack {
    private int maxSize;   // Maximum size of the stack
    private int top;       // Top of the stack
    private int[] stack;   // Array to store stack elements

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;           // Set the size of the stack
        stack = new int[maxSize]; // Create the stack array
        top = -1;                 // Initially, the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {    // Check if stack is not full
            stack[++top] = value;    // Increment top and add value
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top >= 0) {              // Check if stack is not empty
            int value = stack[top];  // Get the value at the top
            top--;                    // Decrease top to remove the element
            return value;
        } else {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (top >= 0) {
            return stack[top];   // Return the top element
        } else {
            System.out.println("Stack is empty.");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Returns true if the stack is empty
    }

    // Method to display the elements of the stack
    public void displayStack() {
        if (top >= 0) {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }

    // Main method to test the Stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of size 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack
        stack.displayStack();

        // Try to push an element into a full stack
        stack.push(60);

        // Pop an element from the stack
        System.out.println(stack.pop() + " popped from stack.");

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // Display the stack again
        stack.displayStack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
