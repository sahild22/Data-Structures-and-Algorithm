package TreesAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {
    public static void main(String[] args) {
        Node root = SerializeDeSerializeBST.buildTree();
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int counter = q.size();
            List<Integer> l = new LinkedList<>();
            while (counter > 0) {
                Node n = q.poll();
                l.add(n.data);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
                counter--;
            }
            result.add(l);
        }
        return result;
    }
}