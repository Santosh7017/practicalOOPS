package practicalL;
/*
string buffer is synchronised and thread safe
methods:
    capacity();
    length();
    append();
    Sb = new

    StringBufferClass();
  new capacity = (old capacity*2)+2


 */

public class StringBufferClass {
    public static void main(String[] args){
        StringBuffer buffer=new StringBuffer("hello");
        System.out.println(buffer.replace(3,4,""));
    }
}
