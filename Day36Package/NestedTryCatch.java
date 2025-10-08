package Day36Package;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=100;
        System.out.println("Enter Number");
        int b=sc.nextInt();
        try{
            System.out.println("Welcome");
            try{
                int c=a/b;
                System.out.println("Division is "+c);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot Divided by zero");
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
