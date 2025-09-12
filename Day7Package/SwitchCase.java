package Day7Package;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();

        switch(name){
            case "Vaishnavi":
                System.out.println("Hello,Vaishnavi");
                break;
            case "Sheetal":
                System.out.println("Hello,Sheetal");
                break;
            case "Harsh":
                System.out.println("Hello,Harsh");
                break;
            default:
                System.out.println("Hello,"+name);
        }
        System.out.println("Enjoy Your Life");

    }
        }
