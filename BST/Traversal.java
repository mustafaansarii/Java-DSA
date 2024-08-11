public class Traversal {
    public static void main(String[] args) {
        // Create a Traversal object
        traversal_insertion tree = new traversal_insertion();
        
        // Create root node
        Node root = new Node(100);
        
        // Insert nodes
        root = tree.insertion(root, 34);
        root = tree.insertion(root, 54);
        root = tree.insertion(root, 74);
        root = tree.insertion(root, 38);
        root = tree.insertion(root, 30);
        
        // Print in-order traversal
        tree.inOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class traversal_insertion {

    Node insertion(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            return new Node(data);
        }
        
        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertion(root.left, data);
        } else if (data > root.data) {
            root.right = insertion(root.right, data);
        }
        
        // Return the (unchanged) node pointer
        return root;
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);
    }
    void postOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }
}
