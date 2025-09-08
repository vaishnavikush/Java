package Day3Package;

public class IncreDecrementOperators {
    public static void main(String[] args){
        int a=1;
        System.out.println("Increment Operator");
        System.out.println(a++);//1
        System.out.println(a);//2
        System.out.println(++a);//3
        System.out.println(a++);//3
        System.out.println(a);//4

        int b=5;
        System.out.println("Decrement Operator");
        System.out.println(b--);//5
        System.out.println(b);//4
        System.out.println(--b);//3
        System.out.println(b--);//3
        System.out.println(b);//2

        System.out.println("-----------");
        int y=7;
        int x=++y*8;
        System.out.println(x);//64

        System.out.println("-----------");
        char ch='A';
        System.out.println(ch++);//A
        System.out.println(ch);//B
        System.out.println(++ch);//C



    }
}
