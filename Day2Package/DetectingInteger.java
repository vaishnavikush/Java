package Day2Package;
import java.util.Scanner;
public class DetectingInteger {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
//        int n1=sc.nextInt();
//        System.out.println(n1);
        boolean n2=sc.hasNextInt();
        System.out.println(n2);
    }
}
