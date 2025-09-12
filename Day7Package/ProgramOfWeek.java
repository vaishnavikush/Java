package Day7Package;
import java.util.Scanner;
public class ProgramOfWeek {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date");
        int Date=sc.nextInt();
        if(Date==1){
            System.out.println("Day Is Monday");
        }
        else if(Date==2){
            System.out.println("Day Is Tuesday");
        }
        else if(Date==3){
            System.out.println("Day Is Wednesday");
        }
        else if(Date==4){
            System.out.println("Day Is Thursday");
        }
        else if(Date==5){
            System.out.println("Day Is Friday");
        }
        else if(Date==6){
            System.out.println("Day Is Saturday");
        }
        else if(Date==7){
            System.out.println("Day Is sunday");
        }
    }
}
