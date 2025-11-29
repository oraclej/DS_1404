package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public static int countLeaves(Node root) {
        if(root == null)
            return 0;
        if(root.getLeft() == null && root.getRight() == null)
            return 1;
        return countLeaves(root.getLeft()) + countLeaves(root.getRight());
    }

    public void breadthFirstTraverse(){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node currentNode = q.poll();
            if(currentNode.getLeft() != null)
                q.add(currentNode.getLeft());
            if(currentNode.getRight() != null)
                q.add(currentNode.getRight());
            System.out.println(currentNode.getData());
        }
    }

    public void insertNodeInBreadth(int newValue){
        Node newNode = new Node(newValue);
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node currentNode = q.poll();
            if(currentNode.getLeft() != null)
                q.add(currentNode.getLeft());
            else {
                currentNode.setLeft(newNode);
                return;
            }
            if(currentNode.getRight() != null)
                q.add(currentNode.getRight());
            else {
                currentNode.setRight(newNode);
                return;
            }
        }
    }

    public static void preOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }
    public static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getData());
    }

    public Node getRoot() {
        return root;
    }
}
