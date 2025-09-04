package Day2Package;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Some Distance in Kilometers");
        int km=sc.nextInt();
        double miles=km*0.621371;
        System.out.println("After Converting Distance into Miles is:"+miles);
    }
}
