

// Driver class
// Calls RecursionOperations.sum() to calculate the sum of the array elements using recursion
import java.util.Scanner; 
import java.util.ArrayList; 

 public class RecursionOperationsMain {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 
        // Use RecursionOperationInput to get user input
        RecursionOperationsInput input = new RecursionOperationsInput();
        // Call the getNumbersArrayList() method to get user input
        ArrayList<Integer> numbers = input.getNumbersArrayList(scanner);
        // Make a copy of the list to avoid modifying the original list
        ArrayList<Integer> listCopy = new ArrayList<>(numbers);
        // Use RecursionOperations.sum() to calculate the sum of the ArrayList elements
        int outputResult = RecursionOperations.sum(listCopy);
        // Print the original list for reference
        System.out.println("\nOriginal list: " + numbers);
        // Display the result
        System.out.println("\nThe sum of the array elements is: " + outputResult);
        // Close the scanner to prevent resource leaks
        scanner.close();   
    }
}