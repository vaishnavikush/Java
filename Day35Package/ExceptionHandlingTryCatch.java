package Day35Package;

public class ExceptionHandlingTryCatch {
    public static void main(String[] args){
        int a=600;
       int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Cannot Divided By Zero");
            System.out.println(e);
        }
    }
}
