package practicalL;
import java.util.Scanner;



class Abc<T> {

    private T t;

//    public Abc(T t){
//
//        this.t = t;


    //    }
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void pattern() {

        for (int i = 0; i < 10; i++) {
                    for(int j = 0;j<i;j++){
                        System.out.print(getT()+" ");
                    }
            System.out.println("");
        }
    }
}

    public class GenericClass {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //   Abc <Integer> obj = new <Integer> Abc(76);
            Abc<Integer> obj1 = new <Integer>Abc();
            Abc<String> obj2 = new <String>Abc();
            obj1.setT(123);
            obj1.pattern();


        }
    }

