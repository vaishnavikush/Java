package Day8Package;
import java.util.Scanner;
public class LeaPYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("The Year is Leap Year");
        }
        else{
            System.out.println("The Year is not Leap Year");
        }
    }
}
