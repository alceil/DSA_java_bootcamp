

class Solution {
    public Node connect(Node root) {
      if(root == null) return null;
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          int qSize = queue.size();
          Node prev = null,curr =null;
          for(int i = 0;i < qSize; i++){
              prev = curr;
              curr = queue.poll();
              if(prev != null)
                  prev.next = curr;
              if(curr.left != null)
                  queue.add(curr.left);
              if(curr.right != null)
                  queue.add(curr.right);
          }
      }
        return root;
    }
}