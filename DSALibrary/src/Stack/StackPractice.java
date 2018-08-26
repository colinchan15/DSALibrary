package Stack;

public class StackPractice {

    int [] a = new int [5];
    int top;

    public void push(int x){
        if(!isFull()) {
            a[top] = x;
            top += 1;
        }else{
            System.out.println("stack overflow");
        }
    }

    public void pop(){
        if(!isEmpty()) {
            top -= 1;
        }else{
            System.out.println("stack underflow");
        }
    }

    public void show(){
        for(int i = 0; i < top; i++){
            System.out.println(a[i]);
        }
    }

    public int getSize(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == 5;
    }

    public static void main(String[] args) {
        StackPractice sp = new StackPractice();
        sp.push(1);
        sp.push(3);
        sp.push(5);
        sp.push(7);
        sp.push(9);

        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();

        System.out.println(sp.getSize());
        System.out.println();

        sp.show();

    }

}
