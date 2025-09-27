package Day16Package;

public class Varargs {
    static int Sum(int ...arr){
        int result=0;
        for(int element:arr){
            result +=element;
        }
       return result;
    }

    static int Sum1(int a, int ...arr){
        int result=a;
        for(int element:arr){
            result +=element;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,56));
        System.out.println(Sum(1,2,67));
        System.out.println("----------");
        System.out.println(Sum1(1,4));
        System.out.println(Sum1(1,23,53));
        System.out.println(Sum1(1,1,72));

    }
}
