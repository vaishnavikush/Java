package Day7Package;
import java.util.Scanner;
public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3;
        System.out.println("Enter Student Physics Marks");
        m1 = sc.nextInt();
        System.out.println("Enter Student Maths Marks");
        m2 = sc.nextInt();
        System.out.println("Enter Student Chemistry Marks");
        m3 = sc.nextInt();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Average Marks Is:"+avg);
        if (avg>44 && m1>33 && m2>33 && m3>33) {
            System.out.println("Student Is Pass");
        } else {
            System.out.println("Student Is Fail");
        }
    }
}