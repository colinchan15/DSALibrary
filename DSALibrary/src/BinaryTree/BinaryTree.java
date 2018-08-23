package BinaryTree;

import BinarySearch.BinarySearch;

public class BinaryTree {

    Node root;

    public Node addRecursive (Node current, int data){

        if(current == null){
            return new Node(data);
        }

        if(data < current.data){
            current.left = addRecursive(current.left,data);
        }
        else if(data > current.data){
            current.right = addRecursive(current.right,data);
        }else{
            return current;
        }
        return current;
    }

    public void add(int data){
        root = addRecursive(root,data);
    }

    public void printInOrder (Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " ");
        printInOrder(node.left);
        printInOrder(node.right);
    }
    public void printInOrder(){
        printInOrder(root);
    }

    public static void main (String [] args){
        BinaryTree bs = new BinaryTree();
        bs.add(1);
        bs.add(2);
        bs.add(3);
        bs.add(4);
        bs.add(5);

        bs.printInOrder();
    }
}
