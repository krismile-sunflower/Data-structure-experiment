package LinkedList;

import java.util.Scanner;

/**
 * 无头结点，循环单链表的约瑟夫生死游戏
 */
public class Joseph {
    private Node first;

    public Joseph() {
        first = new Node(1);
        first.setNext(first);
    }

    public void create(int n) throws Exception {
        System.out.print("人数的顺序为：");
        for (int i = 1; i < n; i++) {
            insert(i, i + 1);
        }
    }

    public void insert(int i, Object x) throws Exception {
        Node p = first.getNext();
        int j = -1;
        while ((!p.getNext().equals(first) || j == -1) && j < i - 1) {
            p = p.getNext();
            ++j;
        }
//        if (j > i - 1 || p.getNext().equals(first) && j != -1) {
//            throw new Exception("插入的位置不合理");
//        }
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    public void display() {
        Node node = first;
        for(int k = 0; k < 30; k++){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void remove(int n,int k) throws Exception {
        for (int i = 0; i < n / 2; i++) {
            Node p = first;
            int j = 2;
            Node node = first;
            while (!p.getNext().equals(first) && j < k) {
                p = p.getNext();
                ++j;
            }
            System.out.println("第"+(i+1) +"轮死亡的人是：" + p.getNext().getData());
            p.setNext(p.getNext().getNext());
            first = p.getNext();    //重新设置首结点
            System.out.print("第"+(i+1) +"轮死亡一人后显示的人数是：");
            int x = 30 - i - 1;     //每一次经过一轮后死亡一人
            for(int y = 0; y < x; y++) {
                System.out.print(node.getData() + " ");
                node = node.getNext();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        Joseph joseph = new Joseph();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入游客的人数：");
        int n = sc.nextInt();
        System.out.print("请输入报数到第几个死亡：");
        int k = sc.nextInt();
        joseph.create(n);
        joseph.display();
        joseph.remove(n, k);
    }
}
