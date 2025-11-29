package tree;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n2.setLeft(n4);
        n2.setRight(n5);
        n1.setLeft(n2);
        n1.setRight(n3);
        Tree tree = new Tree(n1);
        int n = Tree.countLeaves(tree.getRoot());
        System.out.println(n);
        tree.insertNodeInBreadth(60);
        tree.insertNodeInBreadth(70);
        tree.insertNodeInBreadth(80);
        tree.breadthFirstTraverse();
        System.out.println("===");
        Tree.preOrder(tree.getRoot());
        System.out.println("===");
        Tree.inOrder(tree.getRoot());
        System.out.println("===");
        Tree.postOrder(tree.getRoot());
    }
}
