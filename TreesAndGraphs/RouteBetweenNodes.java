package TreesAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class RouteBetweenNodes {
    static class Node {
        int data;
        boolean isVisited;
        private static List<Node> children;
        Node(int data){
            this.data = data;
            this.children = new LinkedList<>();
        }

        private static void addChildren(Node n) {
            children.add(n);
        }
    }
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n0.addChildren(n1);
        n1.addChildren(n2);
        n2.addChildren(n0);
        n3.addChildren(n2);

        System.out.println(findPath(n0, n2));
        System.out.println(findPath(n0, n3));
    }

    public static boolean findPath(Node n1, Node n2) {
        Queue<Node> q = new LinkedList<>();
        q.add(n1);
        n1.isVisited = true;

        while(!q.isEmpty()) {
            Node n = q.poll();
            if(n.data == n2.data) {
                return true;
            }

            for(Node i : n.children) {
                if(!i.isVisited) {
                    q.add(i);
                    i.isVisited = true;
                }
            }
        }

        return false;
    }
}

