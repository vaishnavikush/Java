package Day40Package;
import java.util.Scanner;
public class ExceptionPractice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("HaHa...");
        }
        System.out.println("Enter Your Percentage");
        int percentage=sc.nextInt();
        try {
            if(percentage<0 || percentage>100) {
                throw new IllegalArgumentException();
            }
            System.out.println("Percentage is " + percentage);
        }catch(IllegalArgumentException e1){
            System.out.println("HeHe...");
    }
    }
}
