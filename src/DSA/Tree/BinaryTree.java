package DSA.Tree;

import com.sun.source.tree.Tree;

public class BinaryTree {
    public static TreeNode root;
    private  class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;

        }
    }

    public void preOrder(TreeNode root){
        if(root== null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


        public void createBinary(){
            TreeNode first = new TreeNode(1);
            TreeNode second = new TreeNode(2);
            TreeNode third = new TreeNode(3);
            TreeNode fourth = new TreeNode(4);
            TreeNode fifth = new TreeNode(5);
            TreeNode sixth = new TreeNode(6);
            TreeNode seventh = new TreeNode(7);

            root = first;
            first.left = second;
            first.right = third;
            second.left = fourth;
            second.right = fifth;
        }
    public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();
      binary.createBinary();
      binary.preOrder(binary.root);

    }
}
