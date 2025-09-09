package Day7Package;
import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You Are School Student");
                break;
            case 19:
                System.out.println("You Are College Student");
                break;
            case 23:
                System.out.println("You Are Young Person");
            break;
            default:
                System.out.println("You Are Person");
        }
        System.out.println("Enjoy Your Life");
    }
}
