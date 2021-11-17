package practicalL;

import java.util.*;


public class FirstClass{
    public void  method(int i, int b){
        int add = i+b;
        System.out.println("addition of a and b is:"+add);
    }
    static void method(int i, String name){
        System.out.println("you entered: "+i+"and "+ name);
    }
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        String name = "Santosh kumar morya";

        FirstClass t1 = new FirstClass();


    t1.method(a,b);
    }
}
