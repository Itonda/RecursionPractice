// This class is responsible for handling user input for the program
// It prompts the user to enter 5 numbers and stores them in an array
import java.util.ArrayList; // Import ArrayList for future use
import java.util.Scanner; // Import Scanner for user input
public class RecursionOperationsInput {

    // Helper method to repeatedly prompt and read until a valid integer string is entered
    private String readValidIntegerString(Scanner scanner, String prompt) {
        String input;
        while (true) { // Loop until a valid integer string is returned
            System.out.print(prompt);
            input = scanner.nextLine();
            if (RecursionOperationsUtilities.isInteger(input)) {
                return input; // Return the valid integer string
            }   
        }
    }

    // Method to prompt the user for 5 numbers
    public int[] getNumbersArray(Scanner scanner) {
        int[] numbers = new int[5];
        System.out.println("Please enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            // Use the helper method to get a validated integer string
            String validInputString = readValidIntegerString(scanner, "Enter number " + (i + 1) + ": ");
            
            numbers[i] = Integer.parseInt(validInputString); // Parse the validated string
        }
        return numbers;
    }

    // Method to get a variable number of inputs until a sentinel value ("000")
    public ArrayList<Integer> getNumbersArrayList(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter numbers (enter '000' to finish): ");
        int i = 0; // Initialize counter for prompt numbering
        String inputString; // Hold the validated input string

        while (true) { // Loop indefinitely until sentinel breaks it
            String prompt = "Enter number " + (i + 1) + ": "; // Construct the prompt for the current number
            // Use the helper method to get a validated integer string
            // Note: readValidIntegerString ensures we get a string representing an integer
            inputString = readValidIntegerString(scanner, prompt);

            if (inputString.equals("000")) { // Check for sentinel value *before* parsing
                break; // Exit the loop if sentinel is entered
            }
            // If not sentinel, parse the valid integer string and add to list
            numbers.add(Integer.parseInt(inputString));
            i++; // Increment the counter for the next prompt
            prompt = null; // Clear the prompt variable for next iteration
        }
        return numbers; // Return the list of numbers
    }
}
