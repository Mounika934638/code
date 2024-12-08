// Binary Tree Node class
class BinaryTree {
    int data;
    BinaryTree left, right;

    // Constructor
    public BinaryTree(int item) {
        data = item;
        left = right = null;
    }

    // In-order traversal: Left, Root, Right
    public void inorderTraversal(BinaryTree node) {
        if (node != null) {
            inorderTraversal(node.left); // Traverse left subtree
            System.out.print(node.data + " "); // Visit node
            inorderTraversal(node.right); // Traverse right subtree
        }
    }

    // Pre-order traversal: Root, Left, Right
    public void preorderTraversal(BinaryTree node) {
        if (node != null) {
            System.out.print(node.data + " "); // Visit node
            preorderTraversal(node.left); // Traverse left subtree
            preorderTraversal(node.right); // Traverse right subtree
        }
    }

    // Post-order traversal: Left, Right, Root
    public void postorderTraversal(BinaryTree node) {
        if (node != null) {
            postorderTraversal(node.left); // Traverse left subtree
            postorderTraversal(node.right); // Traverse right subtree
            System.out.print(node.data + " "); // Visit node
        }
    }
}

public class BinaryTreeTraversals {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);

        // Perform traversals
        System.out.println("In-order Traversal:");
        root.inorderTraversal(root); // Output: 4 2 5 1 6 3 7
        System.out.println();

        System.out.println("Pre-order Traversal:");
        root.preorderTraversal(root); // Output: 1 2 4 5 3 6 7
        System.out.println();

        System.out.println("Post-order Traversal:");
        root.postorderTraversal(root); // Output: 4 5 2 6 7 3 1
    }
}
