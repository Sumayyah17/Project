import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeSortTest {
    
    // Tests the required input list
    @Test
    public void testRequiredList() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 5, 8, 3, 1, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 5, 8, 10));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests that an empty list returns an empty list
    @Test
    public void testEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests sorting of a single-element list
      @Test
    public void testSingleElement() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(42));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests sorting with negative numbers included
      @Test
    public void testNegativeNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, -5, 10, -2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-5, -2, 0, 10));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests handling of duplicate values
      @Test
    public void testAllDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 5, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 5, 5));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests sorting when input is already in order
      @Test
    public void testAlreadySorted() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests sorting when input is in reverse order
      @Test
    public void testReverseOrder() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, TreeSort.treeSort(input));
    }
    
    // Tests that null input returns an empty list
      @Test
    public void testNullInput() {
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, TreeSort.treeSort(null));
    }
}