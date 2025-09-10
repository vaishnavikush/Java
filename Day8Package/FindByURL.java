package Day8Package;
import java.util.Scanner;

public class FindByURL {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your URL");
        String Website=sc.next();
        if(Website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(Website.endsWith(".org")){
            System.out.println("Organisation Website");
        }
        else if(Website.endsWith(".in")){
            System.out.println("Indian Website");
        }

    }
}
