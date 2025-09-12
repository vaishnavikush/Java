package Day7Package;
import java.util.Scanner;
public class CalculatingIncome {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        float tax=0;
        System.out.println("Enter Your Income");
        float income=sc.nextFloat();
        if (income<=2.5f) {
            System.out.println("You Does Not Have To Pay Tax");
        } else if (income > 2.5f && income <= 5.0f) {
            System.out.println("You Have TO Pay 5% Tax");
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            System.out.println("You Have TO Pay 20% Tax");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        } else if (income > 10.0f) {
            System.out.println("You Have TO Pay 30% Tax");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total Tax Is Paid By The Employee Is:"+tax);

    }
}
