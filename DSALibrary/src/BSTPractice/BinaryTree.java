package BSTPractice;

public class BinaryTree {

    Node root;

    public Node addRecursive (Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if(data < current.data){
            current.left = addRecursive(current.left,data);
        }else if(data > current.data){
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public void add(int data){
        root = addRecursive(root,data);
    }

    public int findSmallest (Node node){
        return node.left == null ? node.data : findSmallest(node.left);
    }

    public Node deleteRecursive (Node current, int data){
        if(current == null){
            return null;
        }

        if(data < current.data){
            current.left = deleteRecursive(current.left,data);
        }else if(data > current.data){
            current.right = deleteRecursive(current.right, data);
        }else{
            if(current.left == null && current.right == null){
                current = null;
            }else if (current.left == null){
                current = current.right;
            }else if (current.right == null) {
                current = current.left;
            }else{
                int temp = findSmallest(current.right);
                current.data = temp;
                current.right = deleteRecursive(current.right, temp);
            }
        }
        return current;
    }

    public Node delete (int data){
        return deleteRecursive(root,data);
    }

    public void postOrder (Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void printPostOrder(){
        postOrder(root);
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void printInorder(){
        inOrder(root);
    }

    public static void main (String[]args){
        BinaryTree bst = new BinaryTree();
        bst.add(5);
        bst.add(8);
        bst.add(4);
        bst.add(2);
        bst.add(10);
        bst.add(7);

        bst.delete(8);

        bst.printPostOrder();
        System.out.println();
        bst.printInorder();
    }
}
