package Day15Package;

public class StaticMethod2 {
    static void Change(int a){
        a=5;
    }
    static void Change2(int[] arr){
        arr[0]=1;
    }
    public static void main(String[] args){
        int a=3;//it Sends The Copy Of 'a'
        Change(a);//It Does Not Change The Value
        System.out.println(a);//It Will Give The Answer '3'

        System.out.println("------------");
        int []array={2,3,5,7,54};//Array sends The Address(Reference) not Values
        Change2(array);//So, It Will Change The Value
        System.out.println(array[0]);//It Will Give answer "1"
    }
}
