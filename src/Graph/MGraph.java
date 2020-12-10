package Graph;

import java.util.Scanner;

public class MGraph implements IGraph {
    public final static int INFINITY = Integer.MAX_VALUE;
    private GraphKind kind;
    private int vexNum, arcNum;
    private Object[] vexs;
    private int[][] arcs;

    public MGraph() {
        this(null, 0, 0, null, null);
    }

    public MGraph(GraphKind kind, int vexNum, int arcNum, Object[] vexs, int[][] arcs) {
        this.kind = kind;
        this.vexNum = vexNum;
        this.arcNum = arcNum;
        this.vexs = vexs;
        this.arcs = arcs;
    }

    @Override
    public void createGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入图的类型: ");
        GraphKind kind = GraphKind.valueOf(sc.next());
        switch (kind){
            case UDG:
                createUDG();
                return;
            case DG:
                createDG();
                return;
            case UDN:
                createUDN();
                return;
            case DN:
                createDN();
                return;
        }
    }

    //有向网
    private void createDN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入图的顶点数、图的边数: ");
        vexNum = sc.nextInt();
        arcNum = sc.nextInt();
        vexs = new Object[vexNum];
        System.out.println("请分别输入各个图的顶点: ");
        for (int i = 0; i < vexNum; i++) {
            vexs[i] = sc.next();
        }
        arcs = new int[vexNum][vexNum];
        for (int i = 0; i < vexNum; i++) {
            for (int j = 0; j < vexNum; j++) {
                arcs[i][j] = INFINITY;
            }
        }
        System.out.println("请输入各个边的两个顶点及其权值: ");
        for (int i = 0; i < arcNum; i++) {
            int v = locateVex(sc.next());
            int u = locateVex(sc.next());
            arcs[v][u] = sc.nextInt();
        }

    }
    //无向网
    private void createUDN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入图的顶点数、图的边数: ");
        vexNum = sc.nextInt();
        arcNum = sc.nextInt();
        vexs = new Object[vexNum];
        System.out.println("请分别输入各个图的顶点: ");
        for (int i = 0; i < vexNum; i++) {
            vexs[i] = sc.next();
        }
        arcs = new int[vexNum][vexNum];
        for (int i = 0; i < vexNum; i++) {
            for (int j = 0; j < vexNum; j++) {
                arcs[i][j] = INFINITY;
            }
        }
        System.out.println("请输入各个边的两个顶点及其权值: ");
        for (int i = 0; i < arcNum; i++) {
            int v = locateVex(sc.next());
            int u = locateVex(sc.next());
            arcs[v][u] = arcs[u][v] = sc.nextInt();
        }
    }

    private void createDG() {
    }

    private void createUDG() {
    }

    @Override
    public int getVexNum() {
        return vexNum;
    }

    @Override
    public int getArcNum() {
        return arcNum;
    }

    @Override
    public Object getVex(int v) throws Exception {
        if(v < 0 && v >= vexNum){
            throw new Exception("第" + v + "个顶点不存在!");
        }
        return vexs[v];
    }

    @Override
    public int locateVex(Object vex) {
        for (int i = 0; i < vexNum; i++) {
            if (vexs[i].equals(vex)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int firstAdjVex(int v) throws Exception {
        if(v < 0 && v >= vexNum){
            throw new Exception("第" + v + "个顶点不存在!");
        }
        for (int i = 0; i < vexNum; i++) {
            if(arcs[v][i] != 0 && arcs[v][i] < INFINITY){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int nextAdjVex(int v, int w) throws Exception {
        if(v < 0 && v >= vexNum){
            throw new Exception("第" + v + "个顶点不存在!");
        }

        for (int i = w + 1; i < vexNum; i++) {
            if (arcs[v][i] != 0 && arcs[v][i] < INFINITY){
                return i;
            }
        }
        return -1;
    }
}
