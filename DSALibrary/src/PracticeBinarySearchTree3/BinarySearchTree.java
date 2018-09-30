package PracticeBinarySearchTree3;

public class BinarySearchTree {

    Node root;

    public Node add (Node current, int data){
        if (current == null){
            return new Node (data);
        }

        if (data < current.data){
            current.left = add(current.left, data);
        }else if (data > current.data){
            current.right = add(current.right, data);
        }

        return current;

    }

    public void add (int data){
        // why need the root = ???
        root = add(root, data);
    }

    public void inOrder (Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);

    }

    public void printInOrder (){
        inOrder(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();
        bs.add(10);
        bs.add(7);
        bs.add(5);
        bs.add(8);
        bs.add(15);
        bs.add(13);
        bs.add(17);
        bs.add(16);
        bs.add(18);

        bs.printInOrder();
    }

}
