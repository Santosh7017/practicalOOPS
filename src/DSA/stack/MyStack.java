package DSA.stack;

public class MyStack {
    public int top = -1;
    int max = 10;
    int arr[] = new int[max];
    public void push(int data){
        if(top>= max-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }
    int pop(){
        if(top>=0) {
            System.out.print("Poped out:-  ");
            return arr[top--];


        }else {
            System.out.println("Stack is underFlow");
            return 0;
        }
    }
    public int peek(){
        System.out.print("Peek element is:- ");
        return arr[top];
    }

    public void print(){
        for(int i = top;i>=0;i-- ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        MyStack stack =new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
