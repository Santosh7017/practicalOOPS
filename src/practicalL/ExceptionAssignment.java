package practicalL;
import java.util.*;
public class ExceptionAssignment {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int [] ar = new int[n];
        try{
            for (int i = 0;i<n;i++){
                ar[i] = sc.nextInt();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inedex enter the correct position of the array" + e);
        }catch (InputMismatchException e){
            System.out.println("Input is mismatch");
        }
    }
}
