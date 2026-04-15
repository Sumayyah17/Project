public class TreeSortRunner {
    public static void main(String[] args) {
        
        // Creating an instance of the test class
        TreeSortTest testRunner = new TreeSortTest();
        
        try {
            // Running all the JUnit test methods manually:
            testRunner.testRequiredList();
            testRunner.testEmptyList();
            testRunner.testSingleElement();
            testRunner.testNegativeNumbers();
            testRunner.testAllDuplicates();
            testRunner.testAlreadySorted();
            testRunner.testReverseOrder();
            testRunner.testNullInput();
            
            // If no exceptions occur, all tests have passed successfully
            System.out.println("All tests passed successfully.");
            
        } 
        catch (AssertionError e) {
            // If any tests fail, display the failure message
            System.out.println("A test failed: " + e.getMessage());
        }
    }
}