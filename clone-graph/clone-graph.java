/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer,Node> map = new HashMap();
    public Node clone (Node node) {

        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        Node temp = new Node(node.val,new ArrayList());
        map.put(temp.val,temp);
        for(Node n: node.neighbors){
            temp.neighbors.add(clone(n));
        }
        return temp;
        
    } 
    
    
        public Node cloneGraph(Node node) {

            if(node == null)
                return node;
            return clone(node);
    }
}