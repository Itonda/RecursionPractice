// This class is responsible for the recursive logic of the program.
// It contains a method to calculate the sum of an array using recursion.
import java.util.ArrayList;

public class RecursionOperations {
    // Method to calculate the sum of an Array using recursion
    public static int sum(int[] arr, int n) {
        // Base case: if the array is empty, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: return the last element plus the sum of the rest of the array
        return arr[n - 1] + sum(arr, n - 1);
    }
    // Overloaded method to calculate the sum of an ArrayList using recursion
    // Make sure to instantiate ArrayList with Arrays.asList(). E.g. ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static int sum(ArrayList<Integer> list) {
    // Base case: if the list is empty, return 0
    if (list.isEmpty()) {
        return 0;
    }
    // Remove and process the last element recursively
    int lastElement = list.remove(list.size() - 1);
    return lastElement + sum(list);
}

}
    // Inset more operations here. E.g. product, max, min, etc.