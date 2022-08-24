class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String,Set<TreeNode>> nodeByStructure = new HashMap<>();
        String res = traverse(root,nodeByStructure);
        List<TreeNode> ans = new ArrayList<>();
        for(String struct:nodeByStructure.keySet()){
            if(nodeByStructure.get(struct).size()>1){
                ans.add(nodeByStructure.get(struct).iterator().next());
            }
        }
        return ans;
    }
    
    String traverse(TreeNode root, Map<String,Set<TreeNode>> nodeByStructure){
        if(root==null){
            return "#";
        }
        String leftStruct = traverse(root.left,nodeByStructure);
        String rightStruct = traverse(root.right,nodeByStructure);
        String res = leftStruct + "," + rightStruct + "," + root.val;
        Set<TreeNode> nodes = nodeByStructure.getOrDefault(res,new HashSet<>());
        nodes.add(root);
        nodeByStructure.put(res,nodes);
        return res;
    }
}