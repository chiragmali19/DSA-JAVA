// 1. Arrays
// - An array is a collection of elements of the same type stored at contiguous memory locations. 
// - It’s one of the simplest and most used data structures.

public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First Element: " + arr[0]); // Output: 10

        // Iterating through the array
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
