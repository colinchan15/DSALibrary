package Queue;

import java.util.Arrays;

public class QueueTest {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(12);
        q.enqueue(90);


//        System.out.println(q.getSize());
        q.show();
    }

}
