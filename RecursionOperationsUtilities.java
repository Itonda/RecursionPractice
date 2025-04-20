// This class is responsible for storing the utility methods for the program
// Contains a method for validating user input
public class RecursionOperationsUtilities {
    // Method to validate if the input is a an integer
    // Returns boolean for modularity and readability
    // Can be streamlined to return parsed integer at the loss of modularity
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str); // Try to parse the string as an integer
            return true; // If successful, return true
        } catch (NumberFormatException e) {
            // If unsuccessful
            System.out.printf("ERROR: Invalid input \"%s\"%n", str); // Print error message
            return false; 
        }
    }
}
    