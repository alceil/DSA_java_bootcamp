class TrieNode {
    char val;
    TrieNode left, mid, right;
    boolean end;
    
    // Initialize your data structure here.
    public TrieNode() {
        // do nothing
    }
    
    public TrieNode(char val) {
        this.val = val;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if (word != null && !word.isEmpty()) insert(word, 0, root);
    }
    
    private TrieNode insert(String word, int index, TrieNode node) {
        char ch = word.charAt(index);
        if (node == null) node = new TrieNode(ch);
        if (ch < node.val) node.left = insert(word, index, node.left);
        else if (ch > node.val) node.right = insert(word, index, node.right);
        else if (index < word.length() - 1) node.mid = insert(word, index + 1, node.mid);
        else node.end = true;
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if (word == null || word.isEmpty()) return false;
        return search(word, 0, root);
    }
    
    private boolean search(String word, int index, TrieNode node) {
        if (node == null) return false;
        char ch = word.charAt(index);
        if (ch < node.val) return search(word, index, node.left);
        if (ch > node.val) return search(word, index, node.right);
        if (index < word.length() - 1) return search(word, index + 1, node.mid);
        return node.end;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) return false;
        return startsWith(prefix, 0, root);
    }
    
    private boolean startsWith(String prefix, int index, TrieNode node) {
        if (node == null) return false;
        char ch = prefix.charAt(index);
        if (ch < node.val) return startsWith(prefix, index, node.left);
        if (ch > node.val) return startsWith(prefix, index, node.right);
        if (index == prefix.length() - 1) return true;
        return startsWith(prefix, index + 1, node.mid);
    }
}

