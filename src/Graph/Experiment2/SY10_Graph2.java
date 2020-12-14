package Graph.Experiment2;

import Graph.MGraph;
import Queue.LinkQueue;

public class SY10_Graph2 {
    public static void CC_BFS(MGraph G) throws Exception{
        boolean[] visited = new boolean[G.getVexNum()];
        for(int v = 0; v < G.getVexNum(); v++)
            visited[v] = false;
        LinkQueue Q = new LinkQueue();
        LinkQueue P = new LinkQueue();
        int i = 0;
        for(int v = 0; v < G.getVexNum(); v++){
            P.clear();
            if(!visited[v]){
                visited[v] = true;
                P.offer(G.getVex(v));
                Q.offer(v);
                while(!Q.isEmpty()){
                    int u = (Integer)Q.poll();
                    for(int w = G.firstAdjVex(u); w >= 0; w = G.nextAdjVex(u, w)){
                        if(!visited[w]){
                            visited[w] = true;
                            P.offer(G.getVex(w));
                            Q.offer(w);
                        }
                    }
                }
                System.out.println("图的第" + ++i +"个连通分量为:");
                while(!P.isEmpty())
                    System.out.print(P.poll().toString() + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

    }
}
