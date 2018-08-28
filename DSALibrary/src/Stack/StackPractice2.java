package Stack;

public class StackPractice2 {

    int [] a;
    int top;
    int limit;

    public StackPractice2(int x){
        a = new int [x];
        limit = x;
    }

    public void push (int x){
        if(top > limit) throw new IllegalArgumentException();
        a[top] = x;
        top++;
    }

    public void pop (){
        top--;
    }

    public void show(){
        for (int i =0; i<top; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        StackPractice2 sp = new StackPractice2(10);
        sp.push(5);
        sp.push(10);
        sp.push(23);
        sp.push(54);
        sp.push(90);
        sp.push(100);
        sp.push(2);
        sp.push(28);
        sp.push(96);
        sp.push(101);

        sp.pop();
        sp.pop();
        sp.pop();


        sp.show();
    }

}
