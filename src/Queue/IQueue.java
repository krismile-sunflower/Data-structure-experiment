package Queue;

public interface IQueue {
    public void clear();
    public int length();
    public boolean isEmpty();
    public Object peek();
    public void offer(Object x) throws Exception;
    public Object poll();
}
