package Day38Package;
import java.util.Scanner;
public class ThrowsKeyword {
    void divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        System.out.println("Division of two numbers :"+result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        ThrowsKeyword tk=new ThrowsKeyword();
        try{
            tk.divide(a,b);
        }
        catch(Exception e){
            System.out.println("Pagal hai kya bhai tu zero se divide kar raha h..");
            System.out.println(e);
        }
    }
}
