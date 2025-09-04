package Day2Package;
import java.util.Scanner;
public class CalculatingCGPA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Subject Marks");
        int sub1=sc.nextInt();
        double Gp1=sub1/10.0;
        System.out.println("First Subject Marks Out Of 100 is:"+Gp1);

        System.out.println("Enter Second Subject Marks");
        int sub2=sc.nextInt();
        double Gp2=sub1/10.0;
        System.out.println("Second Subject Marks Out Of 100 is:"+Gp2);

        System.out.println("Enter Third Subject Marks");
        int sub3=sc.nextInt();
        double Gp3=sub1/10.0;
        System.out.println("Third Subject Marks Out Of 100 is:"+Gp3);

        double CGPA=(Gp1+Gp2+Gp3)/3;
        System.out.println("So The CGPA is:"+CGPA);

    }
}
