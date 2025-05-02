package com.home.tree.binarysearch;

public class SearchElementInBinarySearchTree {

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

    public TreeNode<Integer> search(TreeNode<Integer> root , int key){
        if(root == null || key == root.data)
            return root;
        if(key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        SearchElementInBinarySearchTree binarySearchTree = new SearchElementInBinarySearchTree();
        binarySearchTree.insert( 5);
        binarySearchTree.insert( 8);
        binarySearchTree.insert( 2);
        binarySearchTree.insert( 7);
        binarySearchTree.insert( 1);
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();
        int key = 10;
        TreeNode<Integer> result = binarySearchTree.search(binarySearchTree.root, key);
        if(result == null)
            System.out.println("Key " +key+ " is not present in the tree");
        else
            System.out.println("Key " +key+ " is present in the tree");
    }
}
