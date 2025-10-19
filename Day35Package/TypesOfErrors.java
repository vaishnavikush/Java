package Day35Package;

public class TypesOfErrors {
    public static void main(String[] args){
        //Syntex Error
       // int a=2;
        //int b=3    Messing of ';'
        //System.out.println("The Sum is : "+(a+b));

        // logical Error
        for(int i=0;i<5;i--){
            System.out.println(i);
        }

        //Runtime Error
        int a=100;
        int b=0;
        System.out.println(a/b);//it causes Exception because number cannot be divided by zero
    }
}
