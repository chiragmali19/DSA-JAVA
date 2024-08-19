// 6. HashMap
// - A HashMap is a data structure that stores key-value pairs. 
// - It allows fast retrieval, addition, and deletion of elements based on the key.

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Access elements by key
        System.out.println("Value for Apple: " + map.get("Apple")); // Output: 10

        // Check if a key exists
        System.out.println("Contains key 'Banana'? " + map.containsKey("Banana")); // Output: true

        // Remove an element
        map.remove("Orange");

        // Iterate through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

