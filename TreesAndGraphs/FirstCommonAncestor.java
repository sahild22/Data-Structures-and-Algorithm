package TreesAndGraphs;

public class FirstCommonAncestor {
    static class Node<T> {
        private T data;
        private Node left;
        private Node right;
        Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(8);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n10 = new Node<>(10);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n20 = new Node<>(20);

        root.left = n4;
        root.right = n10;
        n4.left = n2;
        n4.right = n6;
        n10.right = n20;

        Node<Integer> result = findLCA(root, n2, n20);
        System.out.println(result.data);
    }

    private static Node<Integer> findLCA(Node root, Node n1, Node n2) {
        if(root == null) return null;

        if (root == n1 || root == n2) {
            return root;
        }

        Node<Integer> left = findLCA(root.left, n1, n2);
        Node<Integer> right = findLCA(root.right, n1, n2);

        if (left != null && right != null) return root;
        if (left == null && right == null) return null;

        return left != null ? left : right;
    }
}
