
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class graph1 {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int s, int d, int w) {
            source = s;
            destination = d;
            weight = w;
        }

    }

    public static void BFSutil(ArrayList<Edge> arr[]) {

        boolean vis[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (!vis[i]) {
                BFS(arr, vis);
            }

        }

    }

    public static void BFS(ArrayList<Edge> arr[], boolean vis[]) {

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {

            int curr = q.remove();
            if (!vis[curr]) {

                vis[curr] = true;

                System.out.print(curr + " ");

                for (int i = 0; i < arr[curr].size(); i++) {
                    Edge r = arr[curr].get(i);

                    q.add(r.destination);
                }
            }

        }

    }

    public static void DFS(ArrayList<Edge> arr[]) {

        boolean vis[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!vis[i]) {
                DFSutil(arr, i, vis);
            }
        }

    }

    public static void DFSutil(ArrayList<Edge> arr[], int curr, boolean vis[]) {

        if (vis[curr] == true) {
            return;
        }

        System.out.println(curr + "  ");

        vis[curr] = true;

        for (int i = 0; i < arr[curr].size(); i++) {
            Edge e = arr[curr].get(i);

            DFSutil(arr, e.destination, vis);
        }

    }

    public static boolean Has_Path(ArrayList<Edge> arr[], int src, int dest, boolean vis[]) {

        if (src == dest) {
            return true;
        }

        vis[src] = true;
        for (int i = 0; i < arr[src].size(); i++) {
            Edge e = arr[src].get(i);

            if (!vis[e.destination] && Has_Path(arr, e.destination, dest, vis)) {
                return true;
            }

        }

        return false;

    }

    public static boolean detectcycle(ArrayList<Edge> arr[]) {
        ;

        boolean vis[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!vis[i]) {
                if (detectcycleutil(arr, vis, i, -1)) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean detectcycleutil(ArrayList<Edge> arr[], boolean vis[], int curr, int parent) {

        vis[curr] = true;

        for (int i = 0; i < arr[curr].size(); i++) {
            Edge e = arr[curr].get(i);

            if (!vis[e.destination]) {
                if (detectcycleutil(arr, vis, e.destination, curr)) {
                    return true;
                }
            }

            else if (vis[e.destination] && e.destination != parent) {
                return true;
            }
        }

        return false;

    }

    public static boolean isBipartite(ArrayList<Edge> arr[]) {
        int color[] = new int[arr.length];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (color[i] == -1) {

                // bfs
                q.add(i);
                color[i] = 0;
                while (!q.isEmpty()) {

                    int curr = q.remove();

                    for (int j = 0; j < arr[curr].size(); j++) {
                        Edge e = arr[curr].get(j);

                        if (color[e.destination] == -1) {
                            int nextcolor = color[curr] == 0 ? 1 : 1;
                            color[e.destination]=nextcolor;

                            q.add(e.destination);
                        }

                        else if (color[e.destination]==color[curr]){
                            return false;
                        }
                    }

                }
            }
        }


        return true;

    }




    public static void main(String[] args) {

        // size of vertices utna array

        int V = 7;

        ArrayList<Edge> arr[] = new ArrayList[V];

        // arrayy ke ander null stored h ,, there is a difference between null and emyt
        // arraylist
        /* we will sote empty arraay list to all index of array */

        for (int i = 0; i < V; i++) {
            arr[i] = new ArrayList<Edge>();
        }

        arr[0].add(new Edge(0, 1, 1));
        arr[0].add(new Edge(0, 2, 1));

        arr[1].add(new Edge(1, 0, 1));
        arr[1].add(new Edge(1, 3, 1));

        arr[2].add(new Edge(2, 0, 1));
        arr[2].add(new Edge(2, 4, 1));

        arr[3].add(new Edge(3, 1, 1));
        arr[3].add(new Edge(3, 4, 1));
        arr[3].add(new Edge(3, 5, 1));

        arr[4].add(new Edge(4, 2, 1));
        arr[4].add(new Edge(4, 3, 1));
        arr[4].add(new Edge(4, 5, 1));

        arr[5].add(new Edge(5, 6, 1));
        arr[5].add(new Edge(5, 4, 1));
        arr[5].add(new Edge(5, 3, 1));

        arr[6].add(new Edge(3, 5, 1));

        // BFS(arr);

        // DFS(arr,0,new boolean[V]);

        // System.out.println(Has_Path(arr, 0,3,new boolean[V] ));

        // System.out.println(detectcycle(arr));
        System.out.println(isBipartite(arr));

    }
}