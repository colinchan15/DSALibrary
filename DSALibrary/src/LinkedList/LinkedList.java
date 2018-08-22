package LinkedList;

public class LinkedList {

    Node head;
    Node prev;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(data);
        }
    }

    public int get(int index) {
        int counter = 0;

        if (head == null) {
            return -1;
        }

        Node current = head;

        while (current != null && counter != index) {
            current = current.next;
            counter++;
        }

        return current.data;
    }

    public void remove(int data) {
        Node current = head;
        prev = current;
        if (head == null) {
            return;
        } else if (current.data == data) {
            head = current.next;
        } else {
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(7);
        ll.add(1);
        ll.add(3);
        ll.add(75);
        ll.add(6);
        ll.add(82);

        ll.remove(7);

        System.out.println(ll.get(0));
    }

}
