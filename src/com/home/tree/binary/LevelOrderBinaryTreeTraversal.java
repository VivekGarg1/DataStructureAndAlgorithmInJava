package com.home.tree.binary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderBinaryTreeTraversal {

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

    public void levelOrder(TreeNode<Integer> root){
        if(root == null)
            return;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode<Integer> temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                queue.offer(temp.left);
            if(temp.right != null)
                queue.offer(temp.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderBinaryTreeTraversal binaryTree = new LevelOrderBinaryTreeTraversal();
        binaryTree.createBinaryTree();
        binaryTree.levelOrder(binaryTree.root);
    }
}
