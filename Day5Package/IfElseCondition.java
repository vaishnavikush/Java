package Day5Package;
import java.util.Scanner;

public class IfElseCondition {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>=19){
            System.out.println("You Can Drive");
        }
        else{
            System.out.println("You Cannot Drive");
        }
    }
}
