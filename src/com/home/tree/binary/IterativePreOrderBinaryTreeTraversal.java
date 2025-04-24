package com.home.tree.binary;

import java.util.Stack;

public class IterativePreOrderBinaryTreeTraversal {

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

    public void preOrder(TreeNode<Integer> root){
        if(root == null)
            return;
        Stack<TreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode<Integer> temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
    }

    public static void main(String[] args) {
        IterativePreOrderBinaryTreeTraversal binaryTree = new IterativePreOrderBinaryTreeTraversal();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
    }
}
