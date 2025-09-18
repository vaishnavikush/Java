package Day10Package;
import java.util.Scanner;
public class TableInReserve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Table Number");
        int n=sc.nextInt();
        for(int i=10;i!=0;i--){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
