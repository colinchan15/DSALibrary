package PracticeLinkedList2;

public class LinkedList {

    Node head;

    public void add (int data){
        if (head == null) {
            head = new Node (data);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node (data);
        }
    }

    public void delete(int data){
        if (head == null) {
            return;
        }else if (head.data == data){
            head = head.next;
        }else{
            Node current = head;
            while(current.next.data != data){
                current = current.next;
            }
            if(current.next.data == data){
                current.next = current.next.next;
            }
        }
    }

    public void getLinkedList (){
        if (head == null) {
            return;
        }else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public void swap(int data1, int data2){
        if (head == null){
            return;
        }else{
            Node node = head;
            Node ok = head;
            Node node1 = head;
            Node node2 = head;
            while(node1.data != data1){
                node1 = node1.next;
            }
            while(node2.data != data2){
                node2 = node2.next;
            }
            Node temp = node1;

            while(ok != null){
                if(node == node1){
                    node = node2;
                }
                node.next = ok.next;
                ok = ok.next;
//                if(node == node2){
//                    node = node1;
//                    node.next = ok.next;
//                }
//                System.out.print(node.data + " ");
//                System.out.println();
//                System.out.print(ok.data + " ");
            }
        }
    }

    public Node reverse(Node node){
        Node current = node;
        if(current != null){
            current.next = reverse(current.next);
            System.out.print(current.data + " ");
        }
        return current;
    }

    public void printReverse(){
        reverse(head);
    }

    public void prepend (int data){
        if (head == null){
            head = new Node (data);
        }else{
            Node temp = new Node (data);
            temp.next = head;
            head = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);

//        ll.delete(5);
//        ll.delete(9);
//        ll.delete(1);
        ll.prepend(12);
        ll.prepend(13);


        ll.getLinkedList();
        System.out.println();
        ll.printReverse();
        System.out.println();

//        ll.swap(12,3);

        ll.getLinkedList();
    }

}
