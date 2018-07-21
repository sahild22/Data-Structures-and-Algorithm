package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBST {

     private static class Node<T> {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        isOrder(buildTree());
        System.out.println();
        System.out.println(isBST(buildTree()));
    }

    private static void isOrder(Node root) {
        if(root == null) return;
        isOrder(root.left);
        System.out.print(root.data + " ");
        isOrder(root.right);
    }

    private static boolean isBST(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node n = q.poll();
            if(n.left != null && !(n.left.data < n.data)) return false;
            if(n.right != null && !(n.right.data > n.data)) return false;
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
        return true;
    }

    private static Node buildTree() {
        Node root = new Node(8);
        Node n4 = new Node(4);
        Node n10 = new Node(10);
        Node n2 = new Node(2);
        Node n6 = new Node(6);
        Node n20 = new Node(20);

        root.left = n4;
        root.right = n10;
        n4.left = n2;
        n4.right = n6;
        n10.right = n20;

        return root;
    }

}
