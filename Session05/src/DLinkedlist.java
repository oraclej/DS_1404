public class DLinkedlist {
    private DNode head;

    public void addNodeAtIndex(int index, int data) {
        DNode nn = new DNode(data);
        DNode p = head;
        if(index<0)
            throw new RuntimeException("Invalid Index");
        if(index == 0){
            nn.setNext(head);
            nn.setPrev(null);
            head.setPrev(nn);
            head = nn;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            if (p.getNext() == null)
                break;
            p = p.getNext();
        }
        nn.setPrev(p);
        nn.setNext(p.getNext());
        if (p.getNext() != null)
            p.getNext().setPrev(nn);
        p.setNext(nn);
    }

    public static void main(String[] args) {
        DLinkedlist dlist = new DLinkedlist();
        dlist.addNodeAtIndex(1, 15);
    }
}
