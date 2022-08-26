class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val,q.val);
        int max = Math.max(p.val,q.val);
        
        while(true){
            if(root.val < min){
                root = root.right;
            } else if (root.val > max){
                root = root.left;
            } else{
                return root;
            }
        }
        
    }
}