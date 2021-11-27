package practicalL;
class NotFound extends Exception{
    public NotFound(String str){
        super(str);
    }
}
public class ThrowableException {
    public static void main(String[] args) throws NotFound{
        int a = 1234567890;
if (a<1){
    System.out.println("hello world");
}
        try {
                throw new NotFound("no answer found");


        } catch (NotFound notFound) {
            notFound.printStackTrace();
        }


    }
}
