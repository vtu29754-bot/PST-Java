class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class PST_Java_Week11_Task7 {
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(6);
        root.right.right.left.right = new Node(4);

        System.out.print("Preorder Traversal: ");
        preOrder(root);
        System.out.println();
    }
}

/*
INPUT & OUTPUT:

INPUT:
Tree Root: 1
Right Children: 2 -> 5 -> (left: 3 -> right: 4, right: 6)

OUTPUT:
Preorder Traversal: 1 2 5 3 4 6 
*/
