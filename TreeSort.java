import java.util.ArrayList;

public class TreeSort {
    // Sorts a list of integers using a binary search tree
    // Returns a new sorted list in ascending order.
    public static ArrayList<Integer> treeSort(ArrayList<Integer> List) {
        
        // Handle null or empty input by returning an empty list
        if (List == null || List.isEmpty()) {
            return new ArrayList<>();
        }
        
        Node root = null;
        
        // Builds the binary search tree from the input list
        for (int value : List) {
            
            // First value becomes the root node
            if (root == null) {
                root = new Node(value);
            } else {
                // Insert values into the correct position in the tree
                root.addItem(value);
            }
        }
        
        // Crreate list to store sorted output
        ArrayList<Integer> sortedList = new ArrayList<>();
        
        // Does an in-order walk and returns the values already sorted
        root.walk(sortedList);
        
        return sortedList;
    }
}
