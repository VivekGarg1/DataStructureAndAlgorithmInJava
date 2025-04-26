package com.home.tree.binary;

import java.util.Stack;

public class IterativeInOrderBinaryTreeTraversal {

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
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {
        IterativeInOrderBinaryTreeTraversal binaryTree = new IterativeInOrderBinaryTreeTraversal();
        binaryTree.createBinaryTree();
        binaryTree.inOrder(binaryTree.root);
    }
}
