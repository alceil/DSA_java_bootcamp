class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> res = new LinkedList<>();
       if(root == null) return res;
       Stack<TreeNode> stack = new  Stack<TreeNode>();
       stack.add(root);
       while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            res.add(treeNode.val);
            if(treeNode.right != null){
                stack.push(treeNode.right);
            }
            if(treeNode.left != null){
                stack.push(treeNode.left);
            }
       }
        return res;
    }
}