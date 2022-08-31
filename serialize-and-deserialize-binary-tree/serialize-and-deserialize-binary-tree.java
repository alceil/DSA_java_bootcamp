public class Codec {

    private int index;

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        recursiveSerialize(root, sb);
        return sb.toString();
    }

    private void recursiveSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val + ",");
        recursiveSerialize(root.left, sb);
        recursiveSerialize(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        if ("".equals(data)) {
            return null;
        }

        String[] strings = data.split(",");
        index = 0;
        TreeNode head = recursiveDeserialize(strings);
        return head;
    }

    private TreeNode recursiveDeserialize(String[] strings) {
        if (index < 0 || index >= strings.length) {
            return null;
        }

        String s = strings[index];
        index++;
        if ("#".equals(s)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = recursiveDeserialize(strings);
        node.right = recursiveDeserialize(strings);
        return node;
    }

}