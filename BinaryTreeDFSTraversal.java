package TreesAndGraphs;

import java.util.Stack;

public class BinaryTreeDFSTraversal {
    public static class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data){
            this.data = data;
        }
    }
    
    public static void main(String[] args) {

        Node root = buildTree();
        System.out.println("In-Order:");
        inOrder(root);
        System.out.println();
        inOrderIterativeWay1(root);
        System.out.println();
        inOrderIterativeWay2(root);
        System.out.println();
        System.out.println("Pre-Order:");
        preOrder(root);
        System.out.println();
        preOrderIterative(root);
        System.out.println();
        System.out.println("Post-Order:");
        postOrderIterative(root);
        System.out.println();
        postOrder(root);

        findHeightTopDown(root, 1);
        System.out.println();
        System.out.println();
        System.out.println("Height by Top-Down: " + answer);
        System.out.println("Height by Botton-Up: " + findHeightBottomUp(root));
    }

    private static Node buildTree() {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n7 = new Node<>(7);
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n9 = new Node<>(9);
        Node<Integer> n10 = new Node<>(10);
        Node<Integer> n11 = new Node<>(11);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n8;
        n5.right = n9;
        n3.left = n6;
        n3.right = n7;
        n7.right = n10;
        n10.right = n11;

        return n1;
    }

    private static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void inOrderIterativeWay1(Node root) {
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        while(root != null || s.size() > 0) {
            while(root != null) {
                s.push(root);
                root = root.left;
            }

            root = s.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    private static void inOrderIterativeWay2(Node root) {
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        while(true) {
            if(root != null) {
                s.push(root);
                root = root.left;
            } else {
                if(s.isEmpty()) break;
                root = s.pop();
                System.out.print(root.data + " ");
                root = root.right;
            }
        }
    }

    private static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void preOrderIterative(Node root) {
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        while(true) {
            if(root != null) {
                System.out.print(root.data + " ");
                s.push(root);
                root = root.left;
            } else {
                if(s.isEmpty()) break;
                root = s.pop();
                root = root.right;
            }
        }

    }

    private static void postOrderIterative(Node root) {
        if(root == null) return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()) {
            root = s1.pop();
            if(root.left != null) {
                s1.push(root.left);
            }
            if(root.right != null) {
                s1.push(root.right);
            }
            s2.push(root);
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().data + " ");
        }
    }

    private static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static int answer = 0;
    private static void findHeightTopDown(Node root, int depth){
        if(root == null) return;
        if(root.left == null && root.right == null){
            answer = Math.max(answer, depth);
        }
        findHeightTopDown(root.left, depth + 1);
        findHeightTopDown(root.right, depth + 1);
    }


    private static int findHeightBottomUp(Node root){
        if(root == null) return 0;
        int left = findHeightBottomUp(root.left);
        int right = findHeightBottomUp(root.right);
        return Math.max(left, right) + 1;
    }
}
