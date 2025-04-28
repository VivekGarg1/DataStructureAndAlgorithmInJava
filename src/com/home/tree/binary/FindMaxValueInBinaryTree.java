package com.home.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxValueInBinaryTree {

    private TreeNode<Integer> root;

    public void createBinaryTree() {
        TreeNode<Integer> first = new TreeNode<>(4);
        TreeNode<Integer> second = new TreeNode<>(9);
        TreeNode<Integer> third = new TreeNode<>(7);
        TreeNode<Integer> fourth = new TreeNode<>(5);
        TreeNode<Integer> fifth = new TreeNode<>(8);
        TreeNode<Integer> sixth = new TreeNode<>(6);
        TreeNode<Integer> seventh = new TreeNode<>(2);
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        root = first;
    }

    public int findMax(TreeNode<Integer> root){
        if(root == null)
            return Integer.MIN_VALUE;
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result)
            result = left;
        if(right > result)
            result = right;
        return result;
    }

    public static void main(String[] args) {
        FindMaxValueInBinaryTree binaryTree = new FindMaxValueInBinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("Maximum value in tree is: " + binaryTree.findMax(binaryTree.root));
    }
}
