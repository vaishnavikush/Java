package Day23Package;

class Base1{
    Base1(){
        System.out.println("Hello From Base Class ");
    }
    Base1(int x){
        System.out.println("Parameterised Constructor From Base Class");
    }
}
class Child1 extends Base1{
    Child1(){
        System.out.println("Hello From Child Class");
    }
    Child1(int y){
        super(2);
        System.out.println("Parameterised Constructor From Child Class");
    }
}
class GrandChild extends Child1{
    GrandChild(){
        System.out.println("Hello From GrandChild class");
    }
    GrandChild(int z){
        super(3);
        System.out.println("Parameterised Constructor From GrandChild Class");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args){
        Child1 c1=new Child1();
        System.out.println("--------------");
        Child1 c2=new Child1(1);
        System.out.println("--------------");
        GrandChild g1=new GrandChild();
        System.out.println("--------------");
        GrandChild g2=new GrandChild(2);

    }
}
