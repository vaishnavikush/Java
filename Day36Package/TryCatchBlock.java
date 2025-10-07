package Day36Package;

import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[3];
        marks[0]=54;
        marks[1]=2;
        marks[2]=72;
        System.out.println("\nEnter Array index");
        int ind=sc.nextInt();
        System.out.println("\nEnter Number you want to delete the value at array index");
        int num=sc.nextInt();
        try{
            System.out.println("\nValue at Array index "+marks[ind]);
            System.out.println("Division is "+ marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("\nCannot divided by zero");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nYou entered Array index out of range");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("\nSome Exception occured");
            System.out.println(e);
        }
    }
}
