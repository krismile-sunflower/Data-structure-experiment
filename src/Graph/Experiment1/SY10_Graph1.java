package Graph.Experiment1;

import Graph.IGraph;
import Graph.MGraph;
import Queue.LinkQueue;

public class SY10_Graph1 {
    private static boolean[] visited1;
    public static void BSFTraverse(IGraph G) throws Exception{
        visited1 = new boolean[G.getVexNum()];
        for (int i = 0; i < G.getVexNum(); i++) {
            visited1[i] = false;
        }
        for (int i = 0; i < G.getVexNum(); i++) {
            if(!visited1[i])
                BFS(G, i);
        }
    }

    private static void BFS(IGraph G, int v) throws Exception{
        visited1[v] = true;
        System.out.print(G.getVex(v).toString() + "");
        LinkQueue Q = new LinkQueue();
        Q.offer(v);
        while (!Q.isEmpty()){
            int u = (Integer)Q.poll();
            for (int i = G.firstAdjVex(u); i >= 0; i = G.nextAdjVex(u, i)){
                if (!visited1[i]){
                    visited1[i] = true;
                    System.out.print(G.getVex(i).toString() + " ");
                    Q.offer(i);
                }
            }
        }
    }

    private static boolean[] visited2;
    public static void DFSTraverse(IGraph G) throws Exception{
        visited2 = new boolean[G.getVexNum()];
        for (int i = 0; i < G.getVexNum(); i++) {
            visited2[i] = false;
        }
        for (int i = 0; i < G.getVexNum(); i++) {
            if(!visited2[i]){
                DFS(G, i);
            }
        }
    }

    public static void DFS(IGraph G, int v) throws Exception{
        visited2[v] = true;
        System.out.print(G.getVex(v).toString() + " ");
        for (int i = G.firstAdjVex(v); i >= 0; i = G.nextAdjVex(v, i)) {
            if(!visited2[i]){
                DFS(G, i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        MGraph G = new MGraph();
        G.createGraph();
        System.out.println("图的广度遍历序列: ");
        BSFTraverse(G);
        System.out.println("图的深度遍历序列: ");
        DFSTraverse(G);

    }



}
