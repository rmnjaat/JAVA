import java.util.ArrayList;


public class iscyccleDirected {
    
    static class Edge{
       int src;
       int dest;
    
       public Edge(int s, int d){
           this.src=s;
           this.src=d;
       }
    
    }
    
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();

        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(1,0));
        graph[0].add(new Edge(2,3));
        graph[0].add(new Edge(3,0));
    }


    public static boolean isCycle(ArrayList<Edge> graph[] ){
        boolean vis[]= new boolean[graph.length];
        boolean stk[]= new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stk)){
                        return true;
                }
            }
        }

        return false;
    }


    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stk[]){
            vis[curr]= true;
            stk[curr]= true;


            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(stk[e.dest]){
                    return true;
                }

                if(!vis[e.dest]){
                    if(isCycleUtil(graph, e.dest, vis, stk)){
                        return true;
                    }
                }
                
            }
            stk[curr]= false;

            return false;



    }

    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        
        createGraph(graph);

        System.out.println(isCycle(graph));        
    }
}