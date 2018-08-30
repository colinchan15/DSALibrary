package PracticeLinkedList;

public class LinkedList2 {

    Node head;

    public void add (int x){
        if(head == null){
            head = new Node(x);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(x);
        }
    }

    public void remove (int x) {
        if (head == null) {
            return;
        }else if (head.data == x){
            head = head.next;
        }else{
            Node current = head;
            while(current.next.data != x){
                current = current.next;
            }
            if(current.next.data == x){
                current.next = current.next.next;
            }
        }
    }

    public void prepend(int x){
        if(head == null){
            head = new Node(x);
        }else{
            Node pre = new Node(x);
            pre.next = head;
            head = pre;
        }
    }

    public void show (){
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

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.remove(3);
        ll.remove(1);

        ll.prepend(7);

        ll.show();
    }

}
