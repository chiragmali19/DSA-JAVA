// 5. Binary Trees
// A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child.

// Example: Binary Tree Traversal (In-Order):

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    // In-order Traversal
    void inOrder(TreeNode node) {
        if (node == null)
            return;

        inOrder(node.left);  // Visit left subtree
        System.out.print(node.data + " ");  // Visit node
        inOrder(node.right); // Visit right subtree
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create a simple binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // In-order Traversal
        tree.inOrder(tree.root); // Output: 4 2 5 1 3
    }
}
