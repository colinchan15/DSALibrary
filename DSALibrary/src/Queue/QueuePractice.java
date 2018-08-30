package Queue;

public class QueuePractice {

    int front;
    int rear;
    int [] a;
    int limit;
    int size;

    public QueuePractice (int x){
        a = new int [x];
        limit = x;
    }

    public void enqueue (int x){
        a[rear] = x;
        rear = (rear+1)%limit;
        size++;
    }

    public void dequeue(){
        front = (front + 1)%limit;
        size--;
    }

    public int getSize(){
        return size;
    }

    public void show(){
        for(int i = 0; i<size; i++){
            System.out.print(a[front + i] + " ");
        }
    }

    public static void main(String[] args) {
        QueuePractice qp = new QueuePractice(5);
        qp.enqueue(1);
        qp.enqueue(2);
        qp.enqueue(3);
        qp.enqueue(4);
        qp.enqueue(6);

//        qp.dequeue();
//        qp.dequeue();
//        qp.dequeue();

        qp.show();
    }

}
