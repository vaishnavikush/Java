package Day6Package;
import java.util.Scanner;
public class MultipleIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks=sc.nextInt();
        if(marks>40){
            System.out.println("You Are Excellent");
        }
        else if(marks>30){
            System.out.println("You Are Average");
        }
        else if(marks>17){
            System.out.println("You Are Just Passed");
        }
        else{
            System.out.println("You Are Fail");
        }
    }

}
