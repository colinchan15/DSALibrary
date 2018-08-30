package PracticeStack;

public class Stack {

    int total;
    int [] a = new int [10];
    int top;

//    public Stack (int total){
//        this.total = total;
//    }

    public void push (int x){
        a[top] = x;
        top++;
    }

    public void pop(){
        --top;
    }

    public void getStack(){
        for(int i = 0; i < top; i++){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.pop();
        s.push(4);

        s.getStack();
    }

}
