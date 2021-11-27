package practicalL;

import org.w3c.dom.ls.LSOutput;

class A extends Thread{

    @Override
    public void run() {
//        setPriority(1);


//        String str = "Thread1";
//            setName(str);
//        Thread.yield();
        for(int i = 0;i<=10;i++){
            System.out.println("A: "+i);
//            System.out.println(Thread.currentThread().getName() + " in control");
        }

    }
}
class B extends Thread{
    public void run(){

//        setName("Thread 1");
//        setPriority(4);
//        try {
//            Thread.sleep(500);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        for (int i = 0;i<=10;i++){
            System.out.println("B: "+i);
        }
        // System.out.println(Thread.currentThread().getName());

    }

}
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
       A obj = new A();
        B obj1 = new B();


//        obj.setPriority(1);
//        obj1.setPriority(5);

//        System.out.println("priority of a"+obj.getPriority());
//        System.out.println("priority of b"+obj1.getPriority());
//          obj.run();

//        try{
//            obj.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        obj1.start();
//        System.out.println( obj.isAlive());


//     System.out.println(Thread.currentThread().getName() + " in control");
//        System.out.println(obj.getId());


        obj.start();
//        obj.suspend();

        obj1.start();
//        obj.resume();
    obj.yield();
    }
}
