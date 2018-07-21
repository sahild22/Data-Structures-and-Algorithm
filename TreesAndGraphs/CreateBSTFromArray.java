package TreesAndGraphs;

public class CreateBSTFromArray {

    private static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;
        Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(9);
        int[] arr = new int[]{7, 1, 3, 2, 6, 13};
        for(int i : arr) {
            insert(i, root);
        }
        inOrder(root);
    }

    private static Node insert(int data, Node root) {
        Node<Integer> n = new Node<>(data);
        if(root == null) return n;
        Node<Integer> current = root;
        Node<Integer> rootRef = root;
        while(rootRef != null) {
            current = rootRef;
            if (rootRef.data < data) {
                rootRef = rootRef.right;
            } else {
                rootRef = rootRef.left;
            }
        }

        if(current.data < data) {
            current.right = n;
        } else {
            current.left = n;
        }

        return root;
    }

    private static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

}
