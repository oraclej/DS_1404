import java.util.LinkedList;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void addNodeToLast(int newData){
        Node nn = new Node(newData);
        if(head == null){
            head = nn;
            return;
        }
        Node p = head;
        while (p.getNext() != null)
            p = p.getNext();
        p.setNext(nn);
    }

    public void printList(){
        Node p = head;
        while (p != null){
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNodeToLast(10);
        list.addNodeToLast(20);
        list.addNodeToLast(30);
        list.addNodeToLast(40);
        list.printList();
    }

    /*public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(null);
        MyLinkedList list1 = new MyLinkedList(n1);

    }
*/}
