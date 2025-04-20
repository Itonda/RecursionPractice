import java.util.ArrayList;
import java.util.Arrays;
// // This class is responsible for testing fixes and improvements to the program
public class RecursionOperationsTest {

// ***** TEST CASES *****

public static void main(String[] args) {
    // Test case 1: Empty ArrayList
    ArrayList<Integer> emptyList = new ArrayList<>();
    System.out.println("Test 1 - Empty List: Expected = 0, Actual = " + RecursionOperations.sum(emptyList));

    // Test case 2: ArrayList with positive integers
    ArrayList<Integer> positiveList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Test 2 - Positive Integers: Expected = 15, Actual = " + RecursionOperations.sum(positiveList));

    // Test case 3: ArrayList with negative integers
    ArrayList<Integer> negativeList = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
    System.out.println("Test 3 - Negative Integers: Expected = -15, Actual = " + RecursionOperations.sum(negativeList));

    // Test case 4: ArrayList with mixed positive and negative integers
    ArrayList<Integer> mixedList = new ArrayList<>(Arrays.asList(10, -5, 20, -10, 5));
    System.out.println("Test 4 - Mixed Values: Expected = 20, Actual = " + RecursionOperations.sum(mixedList));

    // Test case 5: ArrayList with a single element
    ArrayList<Integer> singleElementList = new ArrayList<>(Arrays.asList(42));
    System.out.println("Test 5 - Single Element: Expected = 42, Actual = " + RecursionOperations.sum(singleElementList));
}

}


