package Day17Package;
import java.util.Scanner;
public class MultiplicationTable {
    void Multiplication(int n){
        for(int i=1;i<=10;i++){
            int m=n*i;
            System.out.println("The Table is : "+n+"*"+i+"="+m);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MultiplicationTable ml=new MultiplicationTable();
        System.out.println("Enter Number To Make Table");
        int n=sc.nextInt();
        ml.Multiplication(n);
    }
}
