package Queue.Experiment2;

public class CircleSqQueue {
    private int[] queueElem;
    private int rear;

    public CircleSqQueue(int maxSize) {
        rear = -1;
        queueElem = new int[maxSize];
    }

    public void offer(int x){
        rear = (rear + 1) % queueElem.length;
        queueElem[rear] = x;
    }

    public int getElem(int i){
        return queueElem[i];
    }
}
