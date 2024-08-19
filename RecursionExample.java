// 9. Recursion
// - Recursion is a technique where a function calls itself to solve smaller 
// instances of the same problem until it reaches a base case. 
// - Recursion is often used in algorithms like calculating factorials, solving
// the Tower of Hanoi, and performing tree traversals.

// Example: Factorial using Recursion:

public class RecursionExample {
    // Function to calculate factorial
    int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        RecursionExample example = new RecursionExample();
        int number = 5;
        int result = example.factorial(number);
        System.out.println("Factorial of " + number + " is " + result);  // Output: 120
    }
}
