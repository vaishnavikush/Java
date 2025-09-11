package Day6Package;
import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>50){
            System.out.println("You Are Experienced");
        }
        else if(age>40){
            System.out.println("You Are Semi-Experienced");
        }
        else if(age>30){
            System.out.println("You Are Semi-Semi-Experienced");
        }
        else{
            System.out.println("You Are Not Experienced");
        }
    }
}
