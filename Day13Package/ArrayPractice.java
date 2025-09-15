package Day13Package;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] array={3,4,6,8,1,4,7};
        System.out.println("Enter Value");
        int find=sc.nextInt();
        boolean about=false;
        for(int i=0;i<array.length;i++){
            if(find==array[i]){
               about =true;
                break;
            }
            }
        if(about==true){
            System.out.println("Value Is Matched");
        }
        else{
            System.out.println("Value Is Not Matched");
        }

    }
}
