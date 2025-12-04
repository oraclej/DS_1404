package edu.iaun.tree;

public class BST {
    private Node root;

    public void addNode(int value){
        Node nn = new Node(value);
        if(root == null) {
            root = nn;
            return;
        }
        Node p = root;
        while (true) {
            if(p.getData() < value) {
                if (p.getRight() != null)
                    p = p.getRight();
                else {
                    p.setRight(nn);
                    return;
                }
            }else if(p.getData() >= value){
                if (p.getLeft() != null)
                    p = p.getLeft();
                else {
                    p.setLeft(nn);
                    return;
                }
            }

        }
    }

    public static boolean binarySearch(Node tree , int value){
        if(tree == null)
            return false;
        if(tree.getData() == value)
            return true;
        if(tree.getData() > value)
            return binarySearch(tree.getLeft(), value);
        return binarySearch(tree.getRight(), value);
    }

    public Node getRoot() {
        return root;
    }
}
