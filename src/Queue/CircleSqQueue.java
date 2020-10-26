package Queue;

public class CircleSqQueue implements IQueue{
    private Object[] queueElem;
    private int front;
    private int rear;

    public CircleSqQueue(int maxSize) {
        front = rear = 0;
        queueElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        front = rear = 0;
    }

    @Override
    public int length() {
        return (front - rear + queueElem.length) % queueElem.length;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public Object peek() {
        if(front == rear)
            return null;
        else
            return queueElem[front];
    }

    @Override
    public void offer(Object x) throws Exception {
        if((rear + 1) % queueElem.length == front)
            throw new Exception("队列已满");
        else {
            queueElem[rear] = x;
            rear = (rear + 1) % queueElem.length;
        }
    }

    @Override
    public Object poll() {
        if(front == rear)
            return null;
        else {
            Object t = queueElem[front];
            front = (front + 1) % queueElem.length;
            return t;
        }
    }

    public void display(){
        if(!isEmpty()){
            for(int i = front; i != rear; i = (i + 1) % queueElem.length){
                System.out.print(queueElem[i].toString() + " ");
            }
            System.out.println();
        }
        else
            System.out.println("此队列为空");
    }
}
