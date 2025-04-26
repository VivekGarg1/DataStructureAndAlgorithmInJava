package com.home.tree.binary;

public class RecursiveInOrderBinaryTreeTraversal {

    private TreeNode<Integer> root;

    public void createBinaryTree() {
        TreeNode<Integer> first = new TreeNode<>(1);
        TreeNode<Integer> second = new TreeNode<>(2);
        TreeNode<Integer> third = new TreeNode<>(3);
        TreeNode<Integer> fourth = new TreeNode<>(4);
        TreeNode<Integer> fifth = new TreeNode<>(5);
        TreeNode<Integer> sixth = new TreeNode<>(6);
        TreeNode<Integer> seventh = new TreeNode<>(7);
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        root = first;
    }

    public void inOrder(TreeNode<Integer> root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        RecursiveInOrderBinaryTreeTraversal binaryTree = new RecursiveInOrderBinaryTreeTraversal();
        binaryTree.createBinaryTree();
        binaryTree.inOrder(binaryTree.root);
    }
}
