package Test;

public class Linkedlst {
    private Node head;
    private Node tail;
    int size;
    //构造器
    public Linkedlst(){
        tail = head = null;
        size = 0;
    }

    //在链表头部增加节点
    public void addHead(Node hd){
        //如果使用该方法增加链表的第一个节点，则head=tail=hd，且next指向自身。
        if(size==0){
            hd.setNext(hd);
            tail = head = hd;
            size++;
        }
        else{
            tail.setNext(hd);
            hd.setNext(head);
            head = hd;
            size++;
        }
    }

    //在链表尾部增加节点
    public void addTail(Node tl){
        //如果使用该方法增加链表的第一个节点，则tail=head= hd，且next指向自身。
        if(size==0){
            tl.setNext(tl);
            tail = head = tl;
            size++;
        }
        else{
            tail.setNext(tl);
            tl.setNext(head);
            tail = tl;
            size++;
        }
    }

    //删除头部节点，被删掉的head将被自动回收
    public void delHead(){
        if(size>1){
            head = head.getNext();
            tail.setNext(head);
            size--;
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        else{
            System.out.println("There is no elements in the linked list.");
        }
    }

    //删除尾部节点
    public void delTail(){
        if(size>1){
            Node nd = new Node();
            nd = head;
            while(nd.getNext()!=tail){
                nd = nd.getNext();
            }
            nd.setNext(head);
            size--;
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        else{
            System.out.println("There is no elements in the linked list.");
        }
    }

    //打印全部节点
    public void printList(){
        Node nd = new Node();
        nd = head;
        try{
            while(nd.getNext()!=head){
                System.out.print(nd.getData());
                System.out.print("->");
                nd = nd.getNext();
            }
            System.out.print(nd.getData());
            System.out.print("->");
            System.out.print(head.getData());
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
