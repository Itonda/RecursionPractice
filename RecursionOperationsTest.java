import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
// // This class is responsible for testing fixes and improvements to the program
public class RecursionOperationsTest {

// ***** TEST CASES *****

public static void main(String[] args) {
    System.out.println("Test Cases for RecursionOperations.sum(ArrayList<Integer> list):\n");
    // Test case 1: Empty ArrayList
    ArrayList<Integer> emptyList = new ArrayList<>();
    System.out.println("Test 1 - Empty List: Expected = 0, Actual = " + RecursionOperations.sum(emptyList));

    // Test case 2: ArrayList with positive integers
    ArrayList<Integer> positiveList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Test 2 - Positive Integers (1, 2, 3, 4, 5): Expected = 15, Actual = " + RecursionOperations.sum(positiveList));

    // Test case 3: ArrayList with negative integers
    ArrayList<Integer> negativeList = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
    System.out.println("Test 3 - Negative Integers(-1, -2, -3, -4, -5): Expected = -15, Actual = " + RecursionOperations.sum(negativeList));

    // Test case 4: ArrayList with mixed positive and negative integers
    ArrayList<Integer> mixedList = new ArrayList<>(Arrays.asList(10, -5, 20, -10, 5));
    System.out.println("Test 4 - Mixed Values (10, -5, 20, -10, 5): Expected = 20, Actual = " + RecursionOperations.sum(mixedList));

    // Test case 5: ArrayList with a single element
    ArrayList<Integer> singleElementList = new ArrayList<>(Arrays.asList(42));
    System.out.println("Test 5 - Single Element (42): Expected = 42, Actual = " + RecursionOperations.sum(singleElementList));

    // Test case 6: ArrayList with large numbers
    ArrayList<Integer> largeNumbersList = new ArrayList<>(Arrays.asList(1000000, 2000000, 3521000));
    System.out.println("Test 6 - Large Numbers (1000000, 2000000, 3521000): Expected = 6521000, Actual = " + RecursionOperations.sum(largeNumbersList));

    // Test case 7: ArrayList with zero
    ArrayList<Integer> zeroList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
    System.out.println("Test 7 - Zeros (0, 0, 0, 0, 0): Expected = 0, Actual = " + RecursionOperations.sum(zeroList));

    // Test case 8: ArrayList with repeated elements
    ArrayList<Integer> repeatedList = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
    System.out.println("Test 8 - Repeated Elements (1, 1, 1, 1, 1): Expected = 5, Actual = " + RecursionOperations.sum(repeatedList));

    // Test case 9: ArrayList with larger size (10)
    ArrayList<Integer> largerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println("Test 9 - Larger List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10): Expected = 55, Actual = " + RecursionOperations.sum(largerList));
    
}

}


