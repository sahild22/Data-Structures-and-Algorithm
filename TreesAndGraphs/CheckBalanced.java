package TreesAndGraphs;

public class CheckBalanced<T> {
    private static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        private Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = buildTree();
        System.out.println("isUnBalanced: " + isBalanced(root));
    }

    private static boolean isUnBalanced = false;

    private static boolean isBalanced(Node root) {
        checkBalance(root);
        return isUnBalanced;
    }

    private static int checkBalance(Node root) {
        if(root == null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if(Math.abs(left - right) > 1) {
            isUnBalanced = true;
        }
        return Math.max(left, right) + 1;
    }

    private static Node buildTree() {
        Node<Integer> root = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n7 = new Node<>(7);
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n9 = new Node<>(9);
        Node<Integer> n10 = new Node<>(10);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n8;
        n3.left = n6;
        n3.right = n7;
        n7.right = n9;
        n9.right = n10;

        return root;
    }


}
