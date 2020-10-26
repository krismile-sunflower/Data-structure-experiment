package Queue;

import LinkedList.Node;

public class LinkQueue implements IQueue{
    private Node front;
    private Node rear;

    public LinkQueue() {
        front = rear = null;
    }

    @Override
    public void clear() {
        front = rear = null;
    }

    @Override
    public int length() {
        Node p = front;
        int length = 0;
        while(p != null){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Object peek() {
        if(front != null)
            return front.getData();
        else
            return null;
    }

    @Override
    public void offer(Object x) throws Exception {
        Node p = new Node(x);
        if(front != null){
            rear.setNext(p);
            rear = p;
        }
        else
            front = rear = p;

    }

    @Override
    public Object poll() {
        if(front != null){
            Node p = front;
            front = front.getNext();
            if(p == rear)
                rear = null;
            return p.getData();
        }
        else
            return null;
    }

    public void display(){
        Node p = front;
        while(p != null){
            System.out.print(p.getData() + " ");
            p = p.getNext();
        }
        System.out.println();
    }
}
