package LinkedList;

/**
 * 测试约瑟夫生死游戏
 */
public class JosephGame {
    private Node head;

    public JosephGame() {
        head = new Node();
        head.setNext(head);
    }

    public void create() throws Exception {
        System.out.print("人数的顺序为：");
        for (int i = 0; i < 30; i++) {
            insert(i, i + 1);
        }
//        Node p = get();
//        p.setNext(head.getNext());
//        System.out.println(p.getData());

    }

    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j = -1;
        while ((!p.equals(head) || j == -1) && j < i - 1) {
            p = p.getNext();
            ++j;
        }
        if (j > i - 1 || p.equals(head) && j != -1) {
            throw new Exception("插入的位置不合理");
        }
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    public void display() {
        Node node = head.getNext();
        while (!node.equals(head)) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public Node get() throws Exception {
        Node p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < 29) {
            p = p.getNext();
            ++j;
        }
        return p;
    }

    public int length() {
        Node p = head.getNext();
        return 0;
    }

    public void remove() throws Exception {
        for (int i = 0; i < 15; i++) {
            Node p = head.getNext();
            int j = 2;
            int k = 9;
            // 9   18  27
            while (!p.equals(head) && j < 9) {
                p = p.getNext();
                ++j;
            }
            System.out.println("死亡的人是：" + p.getNext().getData());
            p.setNext(p.getNext().getNext());
            System.out.print("显示出的人是：");
            display();
            head = p;
        }

    }

    public static void main(String[] args) throws Exception {
        JosephGame josephGame = new JosephGame();
        josephGame.create();
        josephGame.display();
        josephGame.remove();
    }
}
