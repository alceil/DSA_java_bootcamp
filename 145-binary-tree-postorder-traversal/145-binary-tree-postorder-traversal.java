class Solution {
    public List<Integer> postorderTraversal(TreeNode cur) {
        List<Integer> postOrder = new ArrayList<>();
        if(cur==null) return postOrder;
        Stack<TreeNode> s = new Stack<>();
        while(cur!=null||!s.isEmpty()){
            if(cur!=null){
                s.push(cur);
                cur=cur.left;
            }else{
                TreeNode temp = s.peek().right;
                if(temp==null){
                    temp = s.peek();
                    s.pop();
                    postOrder.add(temp.val);
                    while(!s.isEmpty()&&temp==s.peek().right){
                        temp = s.peek(); 
                        s.pop();
                        postOrder.add(temp.val);
                        
                    }
                }else{
                    cur=temp;
                }
            }
            
        }
        return postOrder;
    }
}