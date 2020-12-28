package Graph.Experiment3;

import Graph.GraphKind;
import Graph.IGraph;
import Graph.MGraph;
import Queue.LinkQueue;

import java.util.Scanner;

public class SY10_Graph3 {
    private final static int INFINITY = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        //记录图的每一个顶点
        Object vexs[] = {"正校门", "东校门", "西校门", "北校门", "食堂",
                "磁悬浮列车实验室", "樱花大道", "图书馆", "体育场", "体育馆",
                "游泳馆", "礼堂", "教学楼", "宿舍"};
        int[][] arcs = {
                {0, INFINITY, INFINITY, INFINITY, 35, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 5, INFINITY, INFINITY},
                {INFINITY, 0, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 75, INFINITY, INFINITY, 10},
                {INFINITY, INFINITY, 0, INFINITY, 30, INFINITY, INFINITY, 5, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY},
                {INFINITY, INFINITY, INFINITY, 0, INFINITY, INFINITY, 15, 50, INFINITY, 15, 20, INFINITY, INFINITY, INFINITY},
                {35, INFINITY, 30, INFINITY, 0, INFINITY, INFINITY, INFINITY, 60, INFINITY, INFINITY, 40, INFINITY, INFINITY},
                {INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 0, INFINITY, INFINITY, 45, INFINITY, INFINITY, 10, INFINITY, INFINITY},
                {INFINITY, INFINITY, INFINITY, 15, INFINITY, INFINITY, 0, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY},
                {INFINITY, INFINITY, 5, 50, INFINITY, INFINITY, INFINITY, 0, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY},
                {INFINITY, INFINITY, INFINITY, INFINITY, 60, 45, INFINITY, INFINITY, 0, INFINITY, INFINITY, 50, INFINITY, INFINITY},
                {INFINITY, INFINITY, INFINITY, 15, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 0, 20, INFINITY, INFINITY, 100},
                {INFINITY, 75, INFINITY, 20, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 20, 0, INFINITY, INFINITY, INFINITY},
                {5, INFINITY, INFINITY, INFINITY, 40, 10, INFINITY, INFINITY, 50, INFINITY, INFINITY, 0, 25, INFINITY},
                {INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 20, 0, 20},
                {INFINITY, 10, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, INFINITY, 100, INFINITY, INFINITY, 20, 0}
        };
        //记录图每一个顶点的信息
        Object messages[][] = {
                {vexs[0], 0, "学校的正校门"}, {vexs[1], 1, "学校的东校门"}, {vexs[2], 2, "学校的西校门"},
                {vexs[3], 3, "学校的北校门"}, {vexs[4], 4, "学校的食堂"}, {vexs[5], 5, "学校的磁悬浮列车实验室"},
                {vexs[6], 6, "学校的樱花大道"}, {vexs[7], 7, "学校的图书馆"}, {vexs[8], 8, "学校的体育场"},
                {vexs[9], 9, "学校的体育馆"}, {vexs[10], 10, "学校的游泳馆"}, {vexs[11], 11, "学校的礼堂"},
                {vexs[12], 12, "学校的教学楼"}, {vexs[13], 13, "学校的宿舍"},
        };
        MGraph G = new MGraph(GraphKind.UDG, 14, 19, vexs, arcs);
        ShortestPath_FLOYD shortestPath_floyd = new ShortestPath_FLOYD();
        shortestPath_floyd.FLOYD(G);
        int n = 0;
        while (n != 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1----查询景点的详细信息; 2----查询两个景点之间的最短路径; 3----退出");
            System.out.print("请输入1或者2或者3: ");
            n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.print("请输入你需要查询的景点: ");
                    String location = scanner.next();
                    Object[] storage = storage(messages, location);
                    if (storage == null){
                        System.out.println("你输入的景点不存在！");
                        break;
                    }
                    System.out.println("景点名称: " + storage[0] +
                            "\t景点代号: " + storage[1] +
                            "\t景点信息: " + storage[2]);
                    break;
                case 2:
                    System.out.print("请输入你需要查询的两个景点: ");
                    String location1 = scanner.next();
                    String location2 = scanner.next();
                    Object[] storage1 = storage(messages, location1);
                    Object[] storage2 = storage(messages, location2);
                    if (storage1 == null || storage2 == null){
                        System.out.println("你输入的景点不存在！");
                        break;
                    }
                    Integer o1 = (Integer) storage1[1];
                    Integer o2 = (Integer) storage2[1];
                    System.out.println("这两个景点之间的最短距离为: " + shortestPath_floyd.getD()[o1][o2]);
                    break;
                case 3:
                    System.out.println("退出系统！");
                    break;
            }
        }
    }

    /*储存单个景点信息*/
    public static Object[] storage(Object messages[][] ,String location){
        Object[] message = new Object[messages[0].length];
        for (int i = 0; i < messages.length; i++) {
            if(messages[i][0].equals(location)){
                for (int j = 0; j < messages[i].length; j++) {
                    message[j] = messages[i][j];
                }
                return message;
            }
        }
        return null;
    }
}
