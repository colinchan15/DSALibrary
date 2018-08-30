package PracticeLinkedList;

public class LinkedList {

    Node head;

    public void add (int x){
        if(head == null){
            head = new Node (x);
        }else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(x);
        }
    }

    public void remove(int x){
        if (head == null) {
            return;
        }

        Node current = head;

        while(current.next.data != x){
            current = current.next;
        }
        if(current.next.data == x){
            current.next = current.next.next;
        }
    }

    public void prepend(int x){
        if (head == null){
            head = new Node (x);
        }else{
            Node n = new Node(x);
            n.next = head;
            head = n;
        }
    }

    public void show (){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(11);

        ll.remove(8);
        ll.remove(11);

        ll.prepend(10);
//        System.out.println(ll.head.data);

        ll.show();
    }

}
