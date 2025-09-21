package Day15Package;

public class VoidMethod {
   static void tell(){
        System.out.println("Hello From Static Void Method");
    }
    void tell2(){
        System.out.println("Hello From Non Static Void Method");
    }
    public static void main(String[] args){
        tell();
        VoidMethod vd=new VoidMethod();
        vd.tell2();
    }
}
