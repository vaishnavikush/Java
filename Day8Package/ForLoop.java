package Day8Package;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("For Loop");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Enter no");
        System.out.println("Odd Numbers");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int odd=i;
           if(odd%2!=0){
               System.out.println(odd);
           }

        }
    }
}
