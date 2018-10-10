package PracticeGraph;

import java.util.LinkedList;

public class PracticeGraph {

    // initialize number of vertices and LinkedList array
    private int v;
    private LinkedList <Integer> adj [];

    // Constructor
    public PracticeGraph (int v){
        // set class v = constructor v
        this.v = v;

        // set size of linkedlist array
        adj = new LinkedList[v];

        // set each Linked list element to have its own array
        for (int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
    }

    // method to add new edge
    public void addEdge (int v, int w){
        adj[v].add(w);
    }

    public static void main(String[] args) {
        PracticeGraph pg = new PracticeGraph(5);

        pg.addEdge(0,3);
        pg.addEdge(0,1);

    }
}
