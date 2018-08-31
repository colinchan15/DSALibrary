package PracticeDLL;

public class DLL {

    Node head;
    Node tail;

    public void add (int data){
        if (head == null) {
            head = new Node (data);
            head.prev = null;
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (data);
            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printReverse (){
        if (head == null) {
            return;
        }else{
            Node current = tail;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.prev;
            }
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL ();
        dll.add(1);
        dll.add(3);
        dll.add(5);
        dll.add(7);

        dll.printReverse();
    }

}
