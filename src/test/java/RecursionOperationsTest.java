// Test class for RecursionOperationsInput and RecursionOperations classes
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach; // Needed for cleanup
import java.util.ArrayList;
import java.util.Arrays;
import java.io.ByteArrayInputStream;
import java.io.InputStream; 
import java.util.Scanner; 

public class RecursionOperationsTest {

    // Store the original System.in stream
    private final InputStream systemIn = System.in;

    // Restore System.in after each test method
    @AfterEach
    void restoreSystemIn() {
        System.setIn(systemIn);
    }

    // --- Test case for getNumbersArray ---
    @Test
    void testGetNumbersArray() {
        // Simulated input: "abc" (invalid) → "5" (valid) → "xyz" (invalid) → "10" (valid) → "?" (invalid) → "15" (valid) → "20" (valid) → "25" (valid)
        String simulatedInput = "abc\n5\nxyz\n10\n?\n15\n20\n25\n";

        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);

        RecursionOperationsInput inputHandler = new RecursionOperationsInput();

        // Expected output
        int[] expected = {5, 10, 15, 20, 25};

        // Validate method output
        int[] actual = inputHandler.getNumbersArray(scanner);
        assertArrayEquals(expected, actual);
    }

    // --- Test case for getNumbersArrayList ---
    @Test
    void testGetNumbersArrayList() {
        // Simulated input: "abc" (invalid) → "10" (valid) → "xyz" (invalid) → "20" (valid) → "30" (valid) → "000" (sentinel)
        String simulatedInput = "abc\n10\nxyz\n20\n30\n000\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Scanner scanner = new Scanner(System.in);
        RecursionOperationsInput inputHandler = new RecursionOperationsInput();

        // Expected output (filtered valid numbers)
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(20);
        expected.add(30);

        // Validate method output
        ArrayList<Integer> actual = inputHandler.getNumbersArrayList(scanner);
        assertEquals(expected, actual);
    }

    // --- Test cases for RecursionOperations.sum(ArrayList<Integer> listCopy) method ---
    @Test
    void testSum() {
        // Test case 1: Empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertEquals(0, RecursionOperations.sum(emptyList));

        // Test case 2: ArrayList with positive integers
        ArrayList<Integer> positiveList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, RecursionOperations.sum(positiveList));

        // Test case 3: ArrayList with negative integers
        ArrayList<Integer> negativeList = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        assertEquals(-15, RecursionOperations.sum(negativeList));

        // Test case 4: ArrayList with mixed positive and negative integers
        ArrayList<Integer> mixedList = new ArrayList<>(Arrays.asList(10, -5, 20, -10, 5));
        assertEquals(20, RecursionOperations.sum(mixedList));

        // Test case 5: ArrayList with a single element
        ArrayList<Integer> singleElementList = new ArrayList<>(Arrays.asList(42));
        assertEquals(42, RecursionOperations.sum(singleElementList));

        // Test case 6: ArrayList with large numbers
        ArrayList<Integer> largeNumbersList = new ArrayList<>(Arrays.asList(1000000, 2000000, 3521000));
        assertEquals(6521000, RecursionOperations.sum(largeNumbersList));

        // Test case 7: ArrayList with zero
        ArrayList<Integer> zeroList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        assertEquals(0, RecursionOperations.sum(zeroList));

        // Test case 8: ArrayList with repeated elements
        ArrayList<Integer> repeatedElements = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        assertEquals(5, RecursionOperations.sum(repeatedElements));

        // Test case 9: Larger list (10 elements)
        ArrayList<Integer> largerInput = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(55, RecursionOperations.sum(largerInput));
    
    }
}