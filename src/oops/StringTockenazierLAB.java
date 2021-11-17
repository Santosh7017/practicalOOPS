package oops;

import java.util.*;

public class StringTockenazierLAB {
    public static void main(String[] args){

        StringTokenizer st = new StringTokenizer("wel,come in GLA",",",false);
     //   System.out.println(st.nextToken());
//while (st.hasMoreTokens()) {
//     System.out.println(st.nextToken(","));
// }
// System.out.println(st.hasMoreTokens());
//
//        System.out.println(st.hasMoreElements());
//        System.out.println(st.nextElement());
      System.out.println(st.countTokens());
    }

}
