package com.home.tree.binary;

import java.util.Stack;

public class IterativePostOrderBinaryTreeTraversal {

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
        TreeNode<Integer> current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null) {
                stack.push(current);
                current = current.left;
            }
            else {
                TreeNode<Integer> temp = stack.peek().right;
                if (stack.peek().right != null) {
                    current = temp;
                } else {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        IterativePostOrderBinaryTreeTraversal binaryTree = new IterativePostOrderBinaryTreeTraversal();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
    }
}
