package PracticeGraph;

import java.util.LinkedList;

public class PracticeGraph2 {

    int v;
    LinkedList <Integer> adj [];

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

    public static void main(String[] args) {
        PracticeGraph2 pg = new PracticeGraph2(5);

        pg.addEdge(0,2);
        pg.addEdge(4,1);

        pg.printGraph();

    }

}
