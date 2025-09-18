package Day10Package;
import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Factorial Value");
        int n=sc.nextInt();
        int i=1;
        int fact=0;
//        for(int i=n;i!=0;i--){
//          int   fact=i;
//           fact1=fact*fact;
//        }
//        System.out.println(fact1);
        while(i<n){
            fact=i;
            n--;
            fact=fact*n;
            i++;
        }
        System.out.println(fact);
    }
}
