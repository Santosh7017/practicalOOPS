package practicalL;
import java.lang.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args){
        int c = 0;
try {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
     c = c*d;
    System.out.println("Succesfully done");
}catch (InputMismatchException h){
    System.out.println("Not good format of integer");
}
        }
    }

