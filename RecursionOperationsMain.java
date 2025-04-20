// Driver class
// Calls RecursionOperations.sum() to calculate the sum of the array elements using recursion

 public class RecursionOperationsMain {
    public static void main(String[] args) {
        // Use RecursionOperationInput to get user input
        RecursionOperationsInput input = new RecursionOperationsInput();

        // Use RecursionOperations.sum() to calculate the sum of the array elements
        // The array size is fixed to 5, so we pass 5 as the second argument
        int outputResult = RecursionOperations.sum(input.getNumbersArray(), 5); 
        
        // Display the result
        System.out.println("The sum of the array elements is: " + outputResult);   
    }
}

