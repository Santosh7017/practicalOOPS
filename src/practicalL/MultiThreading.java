package practicalL;
class A extends Thread{
    @Override
    public void run() {


        String str = "Thread1";

        for(int i = 0;i<=10;i++){
            System.out.println("A: "+i);
        }
    }
}
class B extends Thread{
    public void run(){

        for (int i = 0;i<=10;i++){
            System.out.println("B: "+i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args){
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }
}
