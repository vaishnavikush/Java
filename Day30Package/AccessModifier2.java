package Day30Package;

class modifier{
    private int m=10;
    public int s=0;
    protected int ds=40;
    int x=80;
    void Own(){
        System.out.println("Private is :"+m);
        System.out.println("Public is :"+s);
        System.out.println("Protected is :"+ds);
        System.out.println("Default is :"+x);
    }
}
class access extends modifier{
    void call(){
        //System.out.println("Private is :"+m);//we cannot call private modifier outside the class
        System.out.println("Public is :"+s);
        System.out.println("Protected is :"+ds);
        System.out.println("Default is :"+x);
    }
}
public class AccessModifier2 {
    public static void main(String[] args){
        System.out.println("Access From The Same Class");
        modifier on=new access();
        on.Own();
        System.out.println("-----------------");
        System.out.println("Access From The Child Class");
        access ac=new access();
        ac.call();
    }
}
