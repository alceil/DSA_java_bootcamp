    class BSTIterator {
        private int index;
        private List<Integer> mList; 

        public BSTIterator(TreeNode root) {
            index=0;
            mList = new ArrayList<>();
            inorderTraversal(root,mList);
            
        }

        public int next() {
            return mList.get(index++);
        }

        public boolean hasNext() {
              return index < mList.size();
        }

        // Get the result of inorder traversal
        private void inorderTraversal(TreeNode root, List<Integer> mList) {
            if(root == null) return;
            inorderTraversal(root.left,mList);
            mList.add(root.val);
            inorderTraversal(root.right,mList);
            
        }
    }