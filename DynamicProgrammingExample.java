// 11. Dynamic Programming
// Dynamic Programming (DP) is an optimization technique that involves breaking 
// down problems into simpler subproblems and storing the results of subproblems to
// avoid redundant calculations.

// Example: Fibonacci Series using Dynamic Programming

public class DynamicProgrammingExample {
    // Function to calculate nth Fibonacci number using DP
    int fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        DynamicProgrammingExample example = new DynamicProgrammingExample();
        int number = 10;
        int result = example.fibonacci(number);
        System.out.println("Fibonacci of " + number + " is " + result);  // Output: 55
    }
}
