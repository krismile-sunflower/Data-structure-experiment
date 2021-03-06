package StaticLookupTable.Experiment2;

public class Node {
    private int key;
    private Node next;

    public Node(int key) {
        this.key = key;
    }

    public Node(Node next) {
        this.next = next;
    }

    public Node(int key, Node next) {
        this.key = key;
        this.next = next;
    }

    public Node() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }


}
