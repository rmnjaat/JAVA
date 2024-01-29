import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.src = d;
        }

    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(1, 0));
        graph[0].add(new Edge(2, 3));
        graph[0].add(new Edge(3, 0));
    }


    public static void ts(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                tsUtil(graph,i,vis,stk);
            }
        }

        while (!stk.empty()) {
            System.out.println(stk.pop()+" ");
        }

    }

    public static void tsUtil(ArrayList<Edge> graph[], int curr , boolean vis[],Stack<Integer> stk){
        vis[curr]= true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                tsUtil(graph,e.dest, vis, stk);
            }

        }

        stk.push(curr);
    }

    
}