// 8. Binary Search
// - Binary Search is an efficient algorithm to find an element in a sorted array. 
// - It repeatedly divides the search interval in half.

public class BinarySearchExample {
    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x is greater, ignore the left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore the right half
            else
                right = mid - 1;
        }

        // If the element is not present
        return -1;
    }

    public static void main(String args[]) {
        BinarySearchExample ob = new BinarySearchExample();
        int arr[] = {2, 3, 4, 10, 40};
        int result = ob.binarySearch(arr, 10);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result); // Output: Element found at index 3
    }
}

