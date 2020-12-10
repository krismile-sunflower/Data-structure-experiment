package StaticLookupTable.Experiment2;

public class IndexNode {
    private int maxKey;
    private Node head;

    public IndexNode() {
    }

    public IndexNode(int maxKey) {
        this.maxKey = maxKey;
    }

    public IndexNode(Node head) {
        this.head = head;
    }

    public IndexNode(int maxKey, Node head) {
        this.maxKey = maxKey;
        this.head = head;
    }

    public int getMaxKey() {
        return maxKey;
    }

    public void setMaxKey(int maxKey) {
        this.maxKey = maxKey;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "IndexNode{" +
                "maxKey=" + maxKey +
                ", head=" + head +
                '}';
    }
}
