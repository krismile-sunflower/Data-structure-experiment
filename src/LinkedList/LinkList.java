package LinkedList;

public class LinkList {
    private Node head;

    public LinkList() {
        head = new Node();//初始化头结点
    }

    public int length(){
        Node p = head.getNext();
        int length = 0;
        while (p != null){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    //每个结点的next指向下一个结点
    public Object get(int i) throws Exception{
        Node p = head.getNext();
        int j = 0;
        while (p != null && j < i){
            p = p.getNext();
            ++j;
        }
        if(j > i || p == null){
            throw new Exception("第" + i + "个红素不存在");
        }
        return p.getData();
    }

    public void insert(int i, Object x) throws Exception{
        Node p = head;
        int j = -1;
        while(p != null && j < i - 1){
            p = p.getNext();
            ++j;
        }
        if(j > i - 1 || p == null){
            throw new Exception("插入的位置不合理");
        }
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    public void remove(int i) throws Exception{
        Node p = head;
        int j = -1;
        while (p.getNext() != null && j < i - 1){
            p = p.getNext();
            ++j;
        }
        if(j > i - 1 || p.getNext() == null){
            throw new Exception("删除的位置不合理");
        }
        p.setNext(p.getNext().getNext());
    }

    public void display(){
        Node node = head.getNext();
        while (node != null){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
