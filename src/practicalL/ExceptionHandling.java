package practicalL;
import java.lang.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        int c = 8;

        try {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            c = c / d;
            System.out.println("Succesfully done");
        } catch (InputMismatchException h) {
            System.out.println("Not good format of integer");
            throw new Exception("Can not device by 0");
        }
        catch (Exception e){
            throw new Exception("Can not device by 0");
        }
    }
}


