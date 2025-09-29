package Day27Package;

interface Sample1{
    void method1();
    void method2();
}
interface Sample2 extends Sample1{
    void method3();
    void method4();
}
class SampleMain implements Sample2{
  public void method1(){
        System.out.println("Method One Hu Main");
    }
    public void method2(){
        System.out.println("Method Two Hu Main");
    }
    public void method3(){
        System.out.println("Method Three Hu Main");
    }
    public void method4() {
        System.out.println("Method Four Hu Main");
    }
}
public class InterfaceInInheritance {
    public static void main(String[] args){
        SampleMain sm=new SampleMain();
        sm.method1();
        sm.method2();
        sm.method3();
        sm.method4();
    }
}
