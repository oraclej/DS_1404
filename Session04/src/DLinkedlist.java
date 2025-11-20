public class DLinkedlist {
    private DNode head;

    public void addNodeToLast(int data){
        DNode nn = new DNode(data);
        if(head == null){
            head = nn;
            return;
        }
        DNode p = head;
        while (p.getNext() != null)
            p = p.getNext();
        p.setNext(nn);
        nn.setPrev(p);
    }

    public void printReverse(){
        if(head != null) {
            DNode p = head;
            while (p.getNext() != null)
                p = p.getNext();
            while (p.getPrev() != null) {
                System.out.println(p.getData());
                p = p.getPrev();
            }
        }
    }

    public static void main(String[] args) {
        DLinkedlist dlist = new DLinkedlist();
        dlist.addNodeToLast(40);
    }
}
