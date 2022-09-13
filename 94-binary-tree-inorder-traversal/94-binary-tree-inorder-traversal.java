
class Solution {
    public List<Integer> inorderTraversal(TreeNode curr) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(curr == null) return inOrder;
        while(true){
            if(curr!=null){
                s.push(curr);
                curr=curr.left;
            }else{
                if(s.isEmpty()) break;
                curr = s.peek();
                inOrder.add(curr.val);
                s.pop();
                curr = curr.right;
            }
        }
        return inOrder;
    }
}