// This class is responsible for handling user input for the program
// It prompts the user to enter 5 numbers and stores them in an array
public class RecursionOperationsInput {
    // Method to prompt the user for 5 numbers
    // Uses fixed array of size 5
    public int[] getNumbersArray() {
        int[] numbers = new int[5]; // Array to store 5 numbers
        // Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        // Prompt the user to enter 5 numbers
        System.out.println("Please enter 5 numbers: ");
        // This loop iterates 5 times to read 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            boolean validInput = false; // Flag to initialize input validation
            // Loop until valid input is received
            while (!validInput) { 
                System.out.print("Number " + (i + 1) + ": "); // Prompt for each number
                String input = scanner.nextLine(); // Read user input as a string

                // Validate the input using RecursionOperationsUtilities
                if (RecursionOperationsUtilities.isInteger(input)) {
                    int validatedInput = Integer.parseInt(input); // Parse the string to an integer
                    // Store the integer in the array
                    numbers[i] = validatedInput; 
                    validInput = true; // Set flag to true to exit the loop
                }    
            }
        }
         
        return numbers; // Return the array of numbers
    }

    // TODO: Add another method to get an ArrayList of numbers from the user
    // This method can be used to get a variable number of inputs from the user
    // Prompt user for numbers until they enter a sentinel value (e.g., "000")
    // May want to refactor common code into a separate method to avoid duplication

}

