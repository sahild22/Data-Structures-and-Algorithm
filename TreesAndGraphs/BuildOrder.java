package TreesAndGraphs;

import java.util.LinkedList;
import java.util.List;

public class BuildOrder {

    public static class Node<T> {
        T data;
        boolean isVisited;
        List<Node<T>> children;
        public Node(T data) {
            this.data = data;
            this.children = new LinkedList<Node<T>>();
        }

        public void addChildren(Node n) {
            this.children.add(n);
        }
    }

    public static void main(String[] args) {
        Node<Character> na = new Node<>('a');
        Node<Character> nb = new Node<>('b');
        Node<Character> nc = new Node<>('c');
        Node<Character> nd = new Node<>('d');
        Node<Character> ne = new Node<>('e');
        Node<Character> nf = new Node<>('f');

        na.addChildren(nf);
        nb.addChildren(nf);
        nc.addChildren(nd);
        nd.addChildren(na);
        nd.addChildren(nb);

        buildOrder(nc);
        for(Node<Character> n : result) {
            System.out.print(n.data + " ");
        }
    }

    private static List<Node<Character>> result = new LinkedList<>();

    private static void buildOrder(Node<Character> root) {
        if(root.children.size() == 0) {
            if(!root.isVisited) {
                result.add(root);
            }
            root.isVisited = true;
            return;
        }

        for(Node<Character> n : root.children) {
            if(!n.isVisited) {
                n.isVisited = true;
                buildOrder(n);
                result.add(n);

            }
        }

        if(!root.isVisited) {
            result.add(root);
        }
    }
}
