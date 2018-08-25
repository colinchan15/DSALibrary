package Stack;

public class Stack {

    static int MAX = 10;
    static int [] a = new int [MAX];
    int top = -1;

    public boolean isEmpty(){
        if(top < -1){
            return true;
        }else{
            return false;
        }
    }

    public void push (int x){
        a[++top] = x;
        return;
    }

    public int pop(){
        int x = a[top--];
        return x;
    }

    public void display (int [] ok){
        int length = ok.length;
        for(int i = 0; i < length; i++){
            System.out.println(ok[i] + " ");
        }
    }

    public static void main (String[]args){
        Stack stack = new Stack ();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop() + "popped");
        stack.push(6);

        stack.display(a);

    }

}
