package Day10Package;
import java.util.Scanner;
public class SumTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Table Number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
             sum +=n*i;
//             sum=m+m;
        }
        System.out.println(sum);
    }
}
