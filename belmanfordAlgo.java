import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * belmanfordAlgo
 */
public class belmanfordAlgo {

     static class Edge {
            int src;
            int dest;
            int weight;

            public Edge(int s, int d, int w) {
                this.src = s;
                this.dest = d;
                this.weight = w;

            }

        }

        // O(v.e)
        public static void bf(ArrayList<Edge> graph[], int src){

            int dist[]= new int[graph.length];
            for(int i=0;i<dist.length;i++){
                if(i!=src){
                    dist[i]=Integer.MAX_VALUE; 
                }
            }

            int V= graph.length;

            // O(V)
            for(int i=0;i<V-1;i++){

                //time complexcity of this 2 for loop is is O(E)
                for(int j=0;j<graph.length;j++){
                    for(int k=0;k<graph[j].size();k++){
                        Edge e= graph[j].get(k);

                        int u= e.src;
                        int v= e.dest;
                        int wt = e.weight;


                        //first condition for inf + 1 = inf  na ho
                        if( dist[u]!= Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                            dist[v]=dist[u]+wt;
                        }

                    }
                }
            }


            for(int i=0;i<dist.length;i++){
                System.out.print(dist[i]+" ");
            }
        }


        static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();

            }

            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));

            graph[1].add(new Edge(1, 2, -4));

            graph[2].add(new Edge(2, 3, 2));

            graph[3].add(new Edge(3, 4, 4));

            graph[4].add(new Edge(4, 1, -1));

            // graph[5].add(new Edge(5, 0));
            // graph[5].add(new Edge(5, 2));
        }

        static class Pair implements Comparable<Pair>{
            int v;
            int cost;

            public Pair(int v,int c){
                this.v=v;
                this.cost=c;
            }

            @Override
            public int compareTo(Pair p2){
                return this.cost-p2.cost; 
            }
        }
        public static void prims(ArrayList<Edge> graph[]){
            boolean vis[]= new boolean[graph.length];
            PriorityQueue<Pair> pq = new PriorityQueue<>();

            pq.add(new Pair(0,0));

            int finalcost =0;

             while (!pq.isEmpty()) {
                Pair curr = pq.remove();
                if(!vis[curr.v]){
                    vis[curr.v] = true;
                    finalcost+=curr.cost;

                    for(int i=0;i<graph[curr.v].size();i++){
                        Edge e = graph[curr.v].get(i);
                        pq.add(new Pair(e.dest,e.weight));

                    }
                }
             }
            System.out.println("final cost of Mst = " + finalcost );
        }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        // bf(graph, 0);
        prims(graph);
    }
}