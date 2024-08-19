// 13. Hashing
// - Hashing is a technique used to uniquely identify a specific object from 
// a group of similar objects. 
// - Hashing uses a hash function to convert input into a fixed-size value, 
// typically a hash code.

// Example: HashSet in Java

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Check if an element is in the set
        if (set.contains("Banana")) {
            System.out.println("Banana is in the set");
        }

        // Iterate through the set
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Remove an element
        set.remove("Apple");
        System.out.println("After removing Apple: " + set);
    }
}
