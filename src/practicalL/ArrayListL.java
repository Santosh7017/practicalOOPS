package practicalL;
import java.util.ArrayList;

public class ArrayListL {
    public static void main(String[] args) {
                ArrayList<Integer> al=new ArrayList<Integer>();
                al.add(67);
                al.add(52);
                al.add(54);
                ArrayList<Integer> al2=new ArrayList<Integer>();
                al2.addAll(al);
                al2.add(98);
                al2.add(66);
                al.add(23);
                System.out.println(al); //[67, 52, 54, 23]
                System.out.println(al2); //[67, 52, 54, 98, 66]
                System.out.println(al2.retainAll(al)); //true
                System.out.println(al2); //[67, 52, 54]
                al.remove(new Integer(52));
                System.out.println(al); //[67, 54, 23]
                System.out.println(al.size()); //3
                al2.add(21);
                System.out.println(al2.size()); //4
                System.out.println(al); //[67, 54, 23]
                System.out.println(al2);  //[67, 52, 54, 21]
                al.removeAll(al2);
                System.out.println(al); //[23]
                al2.clear();
                System.out.println(al2); //[]
                System.out.println(al.contains(new Integer(87))); //false
                System.out.println(al.contains(new Integer(23))); //true
                System.out.println(al.isEmpty()); //false
                System.out.println(al2.isEmpty()); //true


    }
}
