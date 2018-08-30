package PracticeBinarySearchTree2;

import java.util.LinkedList;
import java.util.Queue;

public class PBST2 {

    Node root;

    public Node addRecursive (Node node, int data){
        if (node == null){
            node = new Node (data);
        }else{
            if(data < node.data){
                node.left = addRecursive(node.left,data);
            }else if (data > node.data){
                node.right = addRecursive(node.right, data);
            }
        }
        return node;
    }

    public void add (int data){
        root = addRecursive(root, data);
    }

    public int getSmallest (Node node){
        return node.left == null ? node.data : getSmallest(node.left);
    }

    public Node deleteRecursive (Node node, int data){
        if(node == null){
            return null;
        }else{
            if(data < node.data){
                node.left = deleteRecursive(node.left, data);
            }else if (data > node.data){
                node.right = deleteRecursive(node.right,data);
            }else{
                if(node.left == null && node.right == null){
                    node = null;
                }else if (node.left == null){
                    node = node.right;
                } else if (node.right == null) {
                    node = node.left;
                }else{
                    int smallest = getSmallest(node.right);
                    node.data = smallest;
                    node.right = deleteRecursive(node.right, smallest);
                }
            }
        }
        return node;
    }

    public void delete(int data){
        root = deleteRecursive(root,data);
    }

    public void preOrder (Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void levelOrder(Node node){
        Queue <Node> q = new LinkedList<Node>();
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

    public void levelOrder (){
        levelOrder(root);
    }

    public static void main(String[] args) {
        PBST2 pbst2 = new PBST2();
        pbst2.add(7);
        pbst2.add(4);
        pbst2.add(9);
        pbst2.add(3);
        pbst2.add(5);
        pbst2.add(8);
        pbst2.add(10);

        pbst2.delete(4);
        pbst2.delete(5);

        pbst2.preOrder();
        System.out.println();
        pbst2.levelOrder();
    }

}
