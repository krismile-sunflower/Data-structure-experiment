package Sort;

public class RecordNode {
    private Comparable key;
    private Object element;

    public RecordNode() {
    }

    public RecordNode(Object element) {
        this.element = element;
    }

    public RecordNode(Comparable key) {
        this.key = key;
    }

    public RecordNode(Comparable key, Object element) {
        this.key = key;
        this.element = element;
    }

    public Comparable getKey() {
        return key;
    }

    public void setKey(Comparable key) {
        this.key = key;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "RecordNode{" +
                "key=" + key +
                ", element=" + element +
                '}';
    }
}
