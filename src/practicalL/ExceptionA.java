package practicalL;

import java.util.Scanner;

public class ExceptionA {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int [] ar = new int[n];
        try{
            for (int i = 0;i<n;i++){
                ar[i] = sc.nextInt();
            }

        } catch (Exception e) {
            System.out.println("Inedex enter the correct position of th array"+e);
        }
    }
}
