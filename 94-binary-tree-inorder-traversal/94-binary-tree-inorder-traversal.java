
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
 List<Integer> out = new ArrayList<>();
 if(root==null) return out;
 out.addAll(inorderTraversal(root.left));
 out.add(root.val);
 out.addAll(inorderTraversal(root.right));
 return out;  
    }
}