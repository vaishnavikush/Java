package Day41Package;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=100;
        System.out.println("Enter No");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("Division is "+c);
        }catch(ArithmeticException e){
            System.out.println("Cannot Divide by zero baba...");
        }
        finally{
            System.out.println("I am Finally baba...");
        }
    }
}
