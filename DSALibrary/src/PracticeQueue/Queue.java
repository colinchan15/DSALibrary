package PracticeQueue;

public class Queue {

    int [] a = new int [5];
    int head;
    int tail;
    int size;

    public void enqueue(int x){
        a[tail] = x;
        tail = (tail+ 1) % 5;
        size++;
    }

    public void dequeue(){
        head = (head + 1) % 5;
        size--;
    }

    public void get(){
        for(int i = 0; i < size; i++){
            System.out.print(a[head + i] + " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.get();

    }

}
