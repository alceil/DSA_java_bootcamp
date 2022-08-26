class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        while(root != null && root.val != val){
            if(root.val > val) root = root.left;
            else root = root.right;
        }
        return root;
    }
}