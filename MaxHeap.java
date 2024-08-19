// 12. Heaps
// A heap is a specialized tree-based data structure that satisfies the heap property. 
// It is commonly used to implement priority queues.

// Example: Implementing a Max-Heap

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    // Constructor
    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize + 1];
        this.heap[0] = Integer.MAX_VALUE;  // Set the first element to the maximum value
    }

    // Function to insert a new element
    public void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        heap[++size] = element;
        int current = size;

        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Function to remove and return the maximum element
    public int extractMax() {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    // Function to heapify the node at index i
    private void maxHeapify(int i) {
        if (!isLeaf(i)) {
            if (heap[i] < heap[leftChild(i)] || heap[i] < heap[rightChild(i)]) {
                if (heap[leftChild(i)] > heap[rightChild(i)]) {
                    swap(i, leftChild(i));
                    maxHeapify(leftChild(i));
                } else {
                    swap(i, rightChild(i));
                    maxHeapify(rightChild(i));
                }
            }
        }
    }

    // Utility methods to get parent, left child, and right child of a node
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        return pos >= (size / 2) && pos <= size;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // Print the heap
    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent: " + heap[i] + " Left: " + heap[2 * i] + " Right:" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();

        System.out.println("The max value is " + maxHeap.extractMax());  // Output: 84
    }
}
