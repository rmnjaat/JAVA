    import java.util.ArrayList;
    import java.util.PriorityQueue;

    public class allpath {

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

        static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();

            }

            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));

            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));

            graph[2].add(new Edge(2, 4, 3));

            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));

            // graph[5].add(new Edge(5, 0));
            // graph[5].add(new Edge(5, 2));
        }

        public static void pathFinder(ArrayList<Edge> graph[], int src, int dst, String path) {
            if (src == dst) {
                System.out.println(path + dst);
                return;
            }

            for (int i = 0; i < graph[src].size(); i++) {
                Edge e = graph[src].get(i);

                pathFinder(graph, e.dest, dst, path + src);

            }

        }

        static class Pair implements Comparable<Pair> {
            int n;
            int path;

            public Pair(int n, int path) {
                this.n = n;
                this.path = path;
            }

            @Override
            public int compareTo(Pair p2) {

                return this.path - p2.path;
            }

        }

        public static void dijkastra(ArrayList<Edge> graph[], int src) {

            boolean vis[] = new boolean[graph.length];
            int dist[] = new int[graph.length]; // dist[i]-> src to i
            for (int i = 0; i < graph.length; i++) {
                if (i != src) {
                    dist[i] = Integer.MAX_VALUE;

                }
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(src, 0));

            while (!pq.isEmpty()) {
                Pair curr = pq.remove();

                if (!vis[curr.n]) {
                    vis[curr.n] = true;
                    for (int i = 0; i < graph[curr.n].size(); i++) {
                        Edge e = graph[curr.n].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.weight;

                        if(dist[u]+wt < dist[v]){ //updated distance
                            dist[v] = dist[u]+wt;
                            pq.add(new Pair(v, dist[v]));
                        }
                    }
                }

            }


            for(int i=0; i<dist.length;i++){
                System.out.println(dist[i]+" ");
            }
            System.out.println(" ");

        }

        public static void main(String[] args) {
            int v = 6;

            ArrayList<Edge> graph[] = new ArrayList[v];

            createGraph(graph);

            int src = 0;

            // pathFinder(graph, 5, 1, "");

            dijkastra(graph, src);

        }
    }