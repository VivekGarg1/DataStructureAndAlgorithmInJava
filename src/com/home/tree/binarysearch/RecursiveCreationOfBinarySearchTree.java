package com.home.tree.binarysearch;

public class RecursiveCreationOfBinarySearchTree {

    private TreeNode<Integer> root;

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode<Integer> insert(TreeNode<Integer> root, int value) {
        if(root == null){
            root = new TreeNode<>(value);
            return root;
        }
        if(value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        return root;
    }

    public void inOrder(TreeNode<Integer> root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        RecursiveCreationOfBinarySearchTree binarySearchTree = new RecursiveCreationOfBinarySearchTree();
        binarySearchTree.insert( 5);
        binarySearchTree.insert( 8);
        binarySearchTree.insert( 2);
        binarySearchTree.insert( 7);
        binarySearchTree.insert( 1);
        binarySearchTree.inOrder(binarySearchTree.root);
    }
}
