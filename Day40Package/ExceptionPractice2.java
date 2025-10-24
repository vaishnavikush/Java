package Day40Package;
import java.util.Scanner;
public class ExceptionPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
//        boolean flag=true;
        int i = 0;
        while (i < 5) {
            try {
                System.out.println("Enter Array Index");
                int ind = sc.nextInt();
                System.out.println("Array Marks Is " + marks[ind]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error");
        }
    }
}
