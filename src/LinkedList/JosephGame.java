package LinkedList;

public class JosephGame {
    private Node head;

    public JosephGame() {
        head = new Node();
        head.setNext(head);
    }

    public void create() throws Exception {
        System.out.print("总人数的顺序为");
        for(int i = 0; i < 30; i++){
            insert(i, i + 1);
        }
        Node p = head.getNext();
        while (!p.equals(head)){
            p = p.getNext();
        }
        p.setNext(head.getNext());
        System.out.println(p.getData());

    }

    public void insert(int i, Object x) throws Exception{
        Node p = head;
        int j = -1;
        while((!p.equals(head) || j == -1) && j < i - 1){
            p = p.getNext();
            ++j;
        }
        if(j > i - 1 || p.equals(head) && j != -1){
            throw new Exception("插入的位置不合理");
        }
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    public void display(){
        Node node = head.getNext();
        while (!node.equals(head)){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public Object get(int i) throws Exception {
        Node p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.getNext();
            ++j;
        }
        return p.getData();
    }

    public void service(){

    }

    public static void main(String[] args) throws Exception {
        JosephGame josephGame = new JosephGame();
        josephGame.create();
        josephGame.display();
        System.out.println(josephGame.get(30));

    }
}
