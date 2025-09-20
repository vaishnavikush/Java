package Day18Package;
import Day1Package.Sum;

import java.util.Scanner;
public class SumNaturalNo {
    int sum=0;
    void Natural(int n){
        for(int i=1;i<=n;i++){
            sum=sum+i;
//            sum +=i;//You Can Also Add Like This
        }
        System.out.println(sum);
    }
      int sum2=0;
    static int Natural2(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + Natural2(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number Up To Which You Want To Add");
        SumNaturalNo sn=new SumNaturalNo();
        int n=sc.nextInt();
        int m= Natural2(n);
        System.out.println("By Recursion");
        System.out.println(m);
        System.out.println("Without Recursion");
        sn.Natural(n);
    }
}
