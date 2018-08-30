package PracticeBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class PBST {

    Node root;

    public Node addRecursive(Node current, int data){
        if(current == null){
            current = new Node(data);
        }else{
            if(data < current.data){
                current.left = addRecursive(current.left, data);
            }else if(data > current.data){
                current.right = addRecursive(current.right,data);
            }
        }
        return current;
    }

    public void add (int data){
        root = addRecursive(root,data);
    }

    public int getSmallest (Node node){
        return node.left == null ? node.data : getSmallest(node.left);
    }

    public Node deleteRecursive (Node current, int data){
        if(current == null){
            current = new Node (data);
        }else if(data < current.data){
            current.left = deleteRecursive(current.left, data);
        }else if(data > current.data){
            current.right = deleteRecursive(current.right, data);
        }else{
            if(current.right == null && current.left == null){
                current = null;
            }else if(current.right == null){
                current = current.left;
            }else if (current.left == null){
                current= current.right;
            }else{
                int smallest = getSmallest(current.right);
                current.data = smallest;
                current.right = deleteRecursive(current.right, smallest);
            }
        }
        return current;
    }

    public void delete (int data){
        root = deleteRecursive(root,data);
    }

    public void printLevelOrder(){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }

    public void inOrderRecursive (Node node){
        if(node == null){
            return;
        }
        inOrderRecursive(node.left);
        System.out.print(node.data + " ");
        inOrderRecursive(node.right);
    }

    public void inOrder(){
        inOrderRecursive(root);
    }

    public void preOrderRecursive (Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderRecursive(node.left);
        preOrderRecursive(node.right);
    }

    public void preOrder(){
        preOrderRecursive(root);
    }

    public void postOrderRecursive (Node node){
        if (node == null) {
            return;
        }
        postOrderRecursive(node.left);
        postOrderRecursive(node.right);
        System.out.print(node.data + " ");
    }

    public void postOrder(){
        postOrderRecursive(root);
    }



    public static void main(String[] args) {
        PBST pbst = new PBST();
        pbst.add(7);
        pbst.add(4);
        pbst.add(9);
        pbst.add(3);
        pbst.add(5);
        pbst.add(8);
        pbst.add(10);

//        pbst.delete(5);
//        pbst.delete(9);

        pbst.preOrder();
        System.out.println();
        pbst.inOrder();
        System.out.println();
        pbst.postOrder();
        System.out.println();
        pbst.printLevelOrder();

    }

}
