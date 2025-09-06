package Day4Package;

public class DifferPrintingStatement {
    public static void main(String []args){
        String name="Vaishnavi";
        System.out.println(name);
        System.out.println("--------------");
       // System.out.print(name);
        String name1=new String("Sheetal");
        System.out.println(name1);
        System.out.println("--------------");
        int a=2;
        float b=5.4f;
        System.out.printf("The value of a is %d and The value of b is %f",a,b);
        System.out.println();
        System.out.println("--------------");
        System.out.format("The value of a is %d and The value of b is %f",a,b);


    }
}
