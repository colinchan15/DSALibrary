package DoublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public void add (int data){
        if(head == null){
            head = new Node (data);
            head.prev = null;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode= new Node (data);
            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void getListFront(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void getListBack(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public void getReverse(){
        Node current = head;
        while(current != null){
            Node temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(8);
        dll.add(10);
        dll.add(12);
        dll.add(14);
        dll.add(16);

        dll.getListFront();
        System.out.println();
        dll.getListBack();
//        dll.getReverse();
    }

}
