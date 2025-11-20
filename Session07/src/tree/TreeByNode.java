package tree;

public class TreeByNode {
    private Node root;

    public void addNode(int data){

    }

    public static int countLeaves(Node root){
        if(root == null)
            return 0;
        if(root.getLeft()==null && root.getRight() == null)
            return 1;
        return countLeaves(root.getLeft()) + countLeaves(root.getRight());
    }
}
