package TreesAndGraphs;

import java.util.LinkedList;
import java.util.List;

public class SerializeDeSerializeBST {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    private static final List<Integer> l = new LinkedList<>();

    public static void main(String[] args) {
        serialize(buildTree());
        System.out.println(l);

    }

    public static void serialize(Node root) {
        if(root == null) return;
        serialize(root.left);
        l.add(root.data);
        serialize(root.right);
    }

    public static Node buildTree(){
        Node root = new Node(6);
        Node n3 = new Node(3);
        Node n9 = new Node(9);
        Node n2 = new Node(2);
        Node n5 = new Node(5);
        Node n8 = new Node(8);
        Node n11 = new Node(11);
        Node n1 = new Node(1);
        Node n4 = new Node(4);
        Node n7 = new Node(7);
        Node n10 = new Node(10);

        root.left = n3;
        root.right = n9;
        n3.left = n2;
        n3.right = n5;
        n2.left = n1;
        n5.left = n4;
        n9.left = n8;
        n9.right = n11;
        n8.left = n7;
        n11.left = n10;

        return root;
    }

}