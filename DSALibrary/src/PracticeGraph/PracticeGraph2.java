package PracticeGraph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("Duplicates")

public class PracticeGraph2 {

    int v;
    private static LinkedList <Integer> adj [];

    public PracticeGraph2 (int v){
        this.v = v;
        adj = new LinkedList [v];

        for (int i = 0; i < adj.length; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge (int v, int w){
        adj[v].add(w);
    }

    public void printGraph (){
        for (int i = 0; i < adj.length; i++){
            System.out.print("Adjacency list for vertex " + i + " is: " + adj[i]);
            System.out.println();
        }
    }

    public void BFS (int s){
        boolean visited [] = new boolean [v];

        LinkedList <Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s + " ");

            Iterator <Integer> i = adj[s].listIterator();

            while(i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public void DFSHelper (int v, boolean visited []){

        visited[v] = true;
        System.out.print(v + " ");

        Iterator <Integer> i = adj[v].listIterator();

        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFSHelper(n, visited);
            }
        }
    }

    public void DFS (int x){
        boolean visited [] = new boolean[v];

        DFSHelper(x, visited);
    }

    public static void main(String[] args) {
        PracticeGraph2 pg = new PracticeGraph2(5);

        pg.addEdge(0,2);
        pg.addEdge(0,1);
        pg.addEdge(4,1);
        pg.addEdge(1,4);
        pg.addEdge(2,3);
        pg.addEdge(3,4);

        pg.printGraph();

        pg.BFS(0);

        System.out.println();

        pg.DFS(0);

        System.out.println();

        System.out.println(Arrays.toString(adj));

    }

}
