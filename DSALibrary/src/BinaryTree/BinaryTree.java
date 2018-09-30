package BinaryTree;

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
        }
        return current;
    }

    public void add(int data){
        root = addRecursive(root,data);
    }

    public Node findSmallest (Node node) {
        if (node.left == null) {
            return node;
        }
        return findSmallest(node.left);
    }

    public int getSmallest (Node node){
        Node temp = findSmallest(node);
        return temp.data;
    }

    public Node deleteRecursive (Node current, int data){
        if(current == null){
            return null;
        }else if(data < current.data){
            current.left = deleteRecursive(current.left,data);
        }else if (data > current.data){
            current.right = deleteRecursive(current.right,data);
        }else {
            if (current.left == null && current.right == null){
                current = null;
            }else if(current.left == null){
                current = current.right;
            }else if (current.right == null){
                current = current.left;
            }else{
                Node smallest = findSmallest(current.right);
                current.data = smallest.data;
                current.right = deleteRecursive(current.right,smallest.data);
            }
        }
        return current;
    }

    public Node delete (int data){
        return deleteRecursive(root, data);
    }

    public void printPreOrder (Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printPreOrder(){
        printPreOrder(root);
    }

    public void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public void printInOrder(){
        printInOrder(root);
    }

    public void printPostOrder (Node node){
        if (node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void printPostOrder(){
        printPostOrder(root);
    }

    public static void main (String [] args){
        BinaryTree bs = new BinaryTree();
        bs.add(10);
        bs.add(7);
        bs.add(5);
        bs.add(8);
        bs.add(15);
        bs.add(13);
        bs.add(17);
        bs.add(16);
        bs.add(18);

//        bs.delete(15);
        bs.printPreOrder();
        System.out.println();
        bs.printInOrder();
        System.out.println();
        bs.printPostOrder();
    }
}
