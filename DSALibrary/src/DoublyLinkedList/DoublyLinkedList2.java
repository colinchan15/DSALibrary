package DoublyLinkedList;

public class DoublyLinkedList2 {

    Node head;
    Node tail;

    public void add(int x){
        if(head == null){
            head = new Node (x);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node (x);
            current.next = newNode;
            newNode.next = null;
            newNode.prev = current;
            tail = newNode;
        }
    }

//    public void insertAfter(int x, int y){
//        if(head == null){
//            head = new Node (x);
//        }else{
//            Node current = head;
//
//            while(current.data != y){
//                current = current.next;
//            }
//            Node newNode = new Node (x);
//            Node storeNext = current.next;
//            current.next = newNode;
//            newNode.prev = current;
//            newNode.next = storeNext;
//            storeNext.prev = newNode;
//        }
//    }

    public void getReverse(){
        if(head == null){
            return;
        }else{
            Node current = tail;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.prev;
            }
        }
    }

    public void insertAfter(int x, int y){
        if(head == null){
            head = new Node (x);
        }else{
            Node current = head;
            while(current.data != y){
                current = current.next;
            }
            Node newNode = new Node(x);
            Node storeNext = current.next;
            current.next = newNode;
            newNode.prev = current;
            newNode.next = storeNext;
            storeNext.prev = newNode;
        }
    }

    public void getForward(){
        if(head == null){
            return;
        }else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

//    public void reverseDLL(){
//        Node current = head;
//        while(current != null){
//            Node temp = current.prev;
//            current.prev = current.next;
//            current.next = temp;
//            current = current.prev;
//            System.out.print(current.data + " ");
//        }
//    }

    public static void main(String[] args) {
        DoublyLinkedList2 dll = new DoublyLinkedList2();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);

        dll.insertAfter(8,3);

        dll.getForward();

        System.out.println();

        dll.getReverse();

        System.out.println();

    }

}
