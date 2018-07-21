package TreesAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheckSubtree {
    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;
        Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node<Integer> T1 = buildTree1();
        Node<Integer> T2 = buildTree2();

        System.out.println(findNode(T1, T2));

    }

    private static boolean findNode(Node<Integer> T1, Node<Integer> T2) {
        Queue<Node<Integer>> q = new LinkedList<>();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        boolean result = false;
        q.add(T1);
        while (!q.isEmpty() && !result) {
            Node<Integer> n = q.poll();
            if (n.data == T2.data) {
                checkSubtree(n, list1);
                checkSubtree(T2, list2);
                result = compareList(list1, list2);
            }
            if (!result) {
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }
        return result;
    }

    private static boolean compareList(List<String> l1, List<String> l2) {
        boolean result = l1.equals(l2);
        return result;
    }

    private static void checkSubtree(Node<Integer> root, List<String> l) {
        if (root == null) {
            l.add("null");
            return;
        }
        checkSubtree(root.left, l);
        l.add(String.valueOf(root.data));
        checkSubtree(root.right, l);
    }

    private static Node<Integer> buildTree1() {
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

    private static Node<Integer> buildTree2() {
        Node<Integer> root = new Node<>(2);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n98 = new Node<>(98);

        root.left = n4;
        root.right = n5;
        n4.left = n8;
        n4.right = n98;

        return root;
    }
}
