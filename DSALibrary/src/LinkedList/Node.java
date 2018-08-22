package LinkedList;

public class Node {

    Node next;
    int data;

    public Node (int data){
        next = null;
        this.data = data;
    }

    public int getData(){
        return data;
    }

}
