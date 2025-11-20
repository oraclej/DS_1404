public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void addNodeToLast(int newData){
        Node nn = new Node(newData);
        size++;
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

    public int removeFirst(){
        if(head != null) {
            int val = head.getData();
            head = head.getNext();
            size--;
            return val;
        }
        throw new RuntimeException("List is empty");
    }

    public int removeLast(){
        if(head == null)
            throw new RuntimeException("List is Empty");
        if(head.getNext() == null) {
            int val = head.getData();
            head = null;
            size=0;
            return val;
        }
        Node p = head;
        while (p.getNext().getNext() != null)
            p = p.getNext();
        int val = p.getNext().getData();
        p.setNext(null);
        size--;
        return val;
    }

    public static void printRecursive(Node head){
        if(head == null)
            return;
        printRecursive(head.getNext());
        System.out.println(head.getData());
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNodeToLast(10);
        list.addNodeToLast(20);
        list.addNodeToLast(30);
        list.addNodeToLast(40);
        list.printList();
        System.out.println("=====");
        System.out.println(list.getSize());
        MyLinkedList.printRecursive(list.head);
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.printList();
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
