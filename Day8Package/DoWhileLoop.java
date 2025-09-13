package Day8Package;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do While Loop");
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
        System.out.println("Enter no.");
        System.out.println("Natural Numbers");
        int nat=sc.nextInt();
        int y=1;
        do{
            System.out.println(y);
            y++;
        }while(y<=nat);
    }
}
