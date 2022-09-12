class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
 List<Integer> out = new ArrayList<>();
 if(root==null) return out;
 out.addAll(postorderTraversal(root.left));
 out.addAll(postorderTraversal(root.right));
out.add(root.val);
 return out; 
    }
}