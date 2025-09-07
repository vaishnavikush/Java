package Day2Package;
import java.util.Scanner;
public class CalculatingPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks");
        int Marks1=sc.nextInt();
        System.out.println("First Subject Marks is="+Marks1);

        System.out.println("Enter Second Subject Marks");
        int Marks2=sc.nextInt();
        System.out.println("Second Subject Marks is="+Marks2);

        System.out.println("Enter Third Subject Marks");
        int Marks3=sc.nextInt();
        System.out.println("Third Subject Marks is="+Marks3);

        System.out.println("Enter Fourth Subject Marks");
        int Marks4=sc.nextInt();
        System.out.println("Fourth Subject Marks is="+Marks4);

        System.out.println("Enter Fifth Subject Marks");
        int Marks5=sc.nextInt();
        System.out.println("Fifth Subject Marks is="+Marks5);

        int total=Marks1+Marks2+Marks3+Marks4+Marks5;
        System.out.println("Total Marks is:"+total);
//        int totalMarks=500;
        double percentage=(total/500.0)*100;
        System.out.println("Percentage is:"+percentage+"%");
    }
}