package Day29Package;

class one{
    public int a=10;
    private int b=20;
    protected int c=30;
     int d=40;
    void Math(){
        System.out.println("Public value is"+a);
        System.out.println("Private value is"+b);
        System.out.println("Protected value is"+c);
        System.out.println("Default value is"+d);
    }
}
public class AccessModifier {
    public static void main(String[] args){
        System.out.println("Access By Own Class");
        one o=new one();
        o.Math();
        System.out.println("Access By Own Package");
        System.out.println(o.a);
       // System.out.println(o.b); We cannot access Private Modifier within the same package
        System.out.println(o.c);
        System.out.println(o.d);
    }
}
