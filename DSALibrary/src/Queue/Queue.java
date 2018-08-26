package Queue;

public class Queue {

    int [] a = new int [5];
    int front;
    int rear;
    int size;

    public void enqueue (int x){
        if(isFull() == false) {
            a[rear] = x;
            rear = (rear + 1) % 5;
            size = size + 1;
        }else{
            System.out.println("Queue is full.");
        }
    }

    public void dequeue(){
        if(isEmpty() == false) {
            front = (front + 1) % 5;
            size = size - 1;
        }else {
            System.out.println("Queue is empty");
        }
    }

    public int getSize(){
        return size;
    }

    public void show() {
        System.out.println("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[front+i] + " ");
        }
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public boolean isFull(){
        return getSize() == 5;
    }

}
