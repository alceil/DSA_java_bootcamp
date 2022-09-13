class Solution {
    public List<Integer> postorderTraversal(TreeNode cur) {
        List<Integer> postOrder = new ArrayList<>();
        if(cur==null) return postOrder;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(cur);
        while(!s1.isEmpty()){
            TreeNode temp = s1.peek();
            s1.pop();
            s2.push(temp);
            if(temp.left!=null){
                s1.push(temp.left);
            }
            if(temp.right!=null){
                s1.push(temp.right);
            }
        }
        
        while(!s2.isEmpty()){
            postOrder.add(s2.peek().val);
            s2.pop();
        }
        return postOrder;
    }
}