package Day17Package;
import java.util.Scanner;
public class PatternInReverse {
    void Pattern2(int m){
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PatternInReverse pt=new PatternInReverse();
        System.out.println("Pattern In Decreasing Order");
        pt.Pattern2(4);
    }
}
