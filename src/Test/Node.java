package Test;

public class Node {
    //元素类型为int的节点
    private int data;
    private Node next;
    //定义构造器
    public Node(int i, Node nt){
        data = i;
        next = nt;
    }
    public Node(int i){
        this(i,null);
    }
    public Node(){
        this(0,null);
    }
    //更改元素数值
    public void setData(int i){
        data = i;
    }
    //读取元素数值
    public int getData(){
        return data;
    }
    //更改元素的指向
    public void setNext(Node nt){
        next = nt;
    }
    //读取元素的指向
    public Node getNext(){
        return next;
    }
}
