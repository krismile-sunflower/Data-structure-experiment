package LinkedList;

public class DuLinkList {
    private DuLNode head;

    public DuLinkList() {
        head = new DuLNode(); //初始化头结点
        head.setPrior(head); //初始化头结点的前驱和后驱
        head.setNext(head);
    }

    public void insert(int i, Object x) throws Exception{
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.getNext();
            ++j;
        }
        if(j != i && !p.equals(head)){
            throw new Exception("插入的位置不合理");
        }

        DuLNode s = new DuLNode(x);
        p.getPrior().setNext(s);
        s.setPrior(p.getPrior());
        s.setNext(p);
        p.setPrior(s);
    }

    public void display(){
        DuLNode node = head.getNext();
        while (!node.equals(head)){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void move(){
        Object temp;
        DuLNode p = head.getNext(), q = head.getPrior();
        if(!head.equals(null)){
            while (!p.equals(q)){
                while (!p.equals(q) && (Integer)p.getData() > 0)
                    p = p.getNext();
                while (!p.equals(q) && (Integer)q.getData() < 0)
                    q = q.getPrior();
                if(!p.equals(q)){
                    temp = p.getData();
                    p.setData(q.getData());
                    q.setData(temp);
                    if(p.getNext().equals(q))
                        p = q;
                    else {
                        p = p.getNext();
                        q = q.getPrior();
                    }
                }
            }

        }

    }

}

