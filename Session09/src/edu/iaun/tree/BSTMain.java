package edu.iaun.tree;

public class BSTMain {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(5);
        bst.addNode(8);
        bst.addNode(3);
        bst.addNode(9);
        bst.addNode(7);
        System.out.println(BST.binarySearch(bst.getRoot(), 7));
    }
}
