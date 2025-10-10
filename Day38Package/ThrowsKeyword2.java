package Day38Package;

import java.util.Scanner;

public class ThrowsKeyword2 {
    void divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        System.out.println("Division of two numbers :"+result);
    }
    void Personage(int age) throws Exception{
        if(age<=0) {
            throw new Exception();
        }
        else{
            System.out.println("Your age is :"+age);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ThrowsKeyword2 tk=new ThrowsKeyword2();
        ThrowsKeyword2 tk2=new ThrowsKeyword2();
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        try{
            tk.divide(a,b);
        }
        catch(Exception e){
            System.out.println("Pagal hai kya bhai tu zero se divide kar raha h..");
            System.out.println(e);
        }
        System.out.println("Enter Your Age");
        int i=sc.nextInt();
        try{
           tk2.Personage(i);
        }
        catch(Exception e){
            System.out.println("Areey Pagal hai kya bhai tu age zero or negative de raha h..");
            System.out.println(e);
        }
    }
}
