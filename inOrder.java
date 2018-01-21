import java.util.*
/**
 * Iterative inOrder Traversal of Binary Tree
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(true){
            if(root != null){
                s.push(root);
                root = root.left;  
            }else{
                if(s.isEmpty()){
                    break;
                }
                root = s.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }
}