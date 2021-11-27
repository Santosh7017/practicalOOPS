package practicalL;
class A1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("A: " + i);
        }
    }
}
    class B1 implements  Runnable{
        public void run(){
            for(int i = 0;i<10;i++){
                System.out.println("B: "+i);
            }
        }
    }

public class MutithreadingByImplements {
public static void main(String[] args){
Thread t1 = new Thread(new B());

}
}
