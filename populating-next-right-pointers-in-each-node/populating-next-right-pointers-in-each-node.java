class Solution {
    public Node connect(Node root) {
        Queue<Node> curr = new LinkedList<Node>();
        Queue<Node> next = new LinkedList<Node>();
        curr.add(root);
        while (!curr.isEmpty()) {
            Node node = curr.poll();
            if (node != null && node.left != null) next.add(node.left);
            if (node != null && node.right != null) next.add(node.right);
            if(curr.isEmpty()) {
                if (node != null) node.next = null;
                curr = next;
                next = new LinkedList<Node>();
            } else {
                node.next = curr.peek();
            }
        }
        return root;
    }
}