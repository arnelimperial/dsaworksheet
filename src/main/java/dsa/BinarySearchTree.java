// Implementing two insertion algorithms: Push for a Stack and Insert for a Binary Search Tree (BST).

package dsa;

class TreeNode {

    int value;
    TreeNode left, right;

    public TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

public class BinarySearchTree {

    TreeNode root;

    // Method to insert a new value in the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new value
    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Inorder traversal to display the tree
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        System.out.print("Inorder traversal of BST: ");
        bst.inorder(); // Display the BST
    }
}
