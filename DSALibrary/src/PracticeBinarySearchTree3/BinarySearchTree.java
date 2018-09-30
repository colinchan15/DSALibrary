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

    public int getSmallest (Node current){
        return current.left != null ? getSmallest(current.left) : current.data;
    }

    public Node delete (Node current, int data){
        if (current == null){
            return null;
        }

        if (data < current.data){
            current.left = delete(current.left, data);
        }else if (data > current.data){
            current.right = delete (current.right, data);
        }else{
            if(current.left == null && current.right == null){
                current = null;
            }else if (current.right == null){
                current = current.left;
            }else if (current.left == null){
                current = current.right;
            }else{
                int smallest = getSmallest(current.right);
                current.data = smallest;
                delete(current.right, smallest);
            }
        }
        return current;
    }

    public void delete (int data){
        root = delete(root, data);
    }

    public void postOrder (Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void postOrder (){
        postOrder(root);
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

        bs.delete(15);
        bs.delete(10);

        bs.printInOrder();
        System.out.println();
        bs.postOrder();
    }

}
