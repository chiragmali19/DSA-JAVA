// 3. Stacks
// - A stack is a Last-In-First-Out (LIFO) data structure. 
// - The last element added to the stack is the first one to be removed. 
// - Common operations are push, pop, and peek.

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top Element: " + stack.peek()); // Output: 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Popped: " + stack.pop()); // Output: 20

        // Check if the stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty()); // Output: false
    }
}
