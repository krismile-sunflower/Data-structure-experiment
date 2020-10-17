package LinkedList;

public class DuLNode {
    private Object data;
    private DuLNode prior;
    private DuLNode next;

    public DuLNode(){
        this(null);
    }

    public DuLNode(Object data){
        this.data = data;
        this.prior = null;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DuLNode getPrior() {
        return prior;
    }

    public void setPrior(DuLNode prior) {
        this.prior = prior;
    }

    public DuLNode getNext() {
        return next;
    }

    public void setNext(DuLNode next) {
        this.next = next;
    }
}
