package com.home.tree.binarysearch;

public class IsValidBinarySearchTree {

    private TreeNode<Integer> root;

    public void createBinaryTree() {
        TreeNode<Integer> first = new TreeNode<>(6);
        TreeNode<Integer> second = new TreeNode<>(4);
        TreeNode<Integer> third = new TreeNode<>(8);
        TreeNode<Integer> fourth = new TreeNode<>(2);
        TreeNode<Integer> fifth = new TreeNode<>(5);
        TreeNode<Integer> sixth = new TreeNode<>(7);
        TreeNode<Integer> seventh = new TreeNode<>(9);
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        root = first;
    }

    public boolean isValid(TreeNode<Integer> root, long min, long max){
        if(root == null)
            return true;
        if(root.data <= min || root.data >= max)
            return false;
        boolean left = isValid(root.left, min, root.data);
        if(left){
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        IsValidBinarySearchTree binarySearchTree = new IsValidBinarySearchTree();
        binarySearchTree.createBinaryTree();
        boolean result = binarySearchTree.isValid(binarySearchTree.root, Long.MIN_VALUE , Long.MAX_VALUE);
        if(result)
            System.out.println("Valid BST");
        else
            System.out.println("Invalid BST");
    }
}
