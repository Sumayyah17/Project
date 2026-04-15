import java.util.ArrayList;

public class Node {
    
    private int data;      // Value is stored in this node
    private Node left;     // Left child node (smaller values)
    private Node right;    // Right child node (greater or equal values)
    
    // Creating a node containing the given value
    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
    
    // Inserts a value into the correct position in the binary search tree
    public void addItem(int value) {
        
        // If value is smaller, go to the left subtree
        if (value < data) {
            
            // If no left child exists, create one
            if (left == null) {
                left = new Node(value);
            } else {
                // Otherwise continue inserting into left subtree
                left.addItem(value);
            }
            
        } else {
            
            // If value is greater or equal, go to the right subtree
            if (right == null) {
                right = new Node(value);
            } else {
                // Otherwise continue inserting into right subtree
                right.addItem(value);
            }
        }
    }
    
    // Visits nodes in order and adds values to result list
    public void walk(ArrayList<Integer> result) {
        
        // Safety check: do nothing if result list is null
        if (result == null) {
            return;
        }
        
        // Traverse left subtree first (smaller values)
        if (left != null) {
            left.walk(result);
        }
        
        // Visit current node (add value to sorted output)
        result.add(data);
    
        // Traverse right suntree last (larger values)
        if (right != null) {
            right.walk(result);
        }
    }
}