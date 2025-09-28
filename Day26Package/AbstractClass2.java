package Day26Package;

class Three{
    void Show(){
        System.out.println("Hola From Three");
    }
}
abstract class one1 extends Three{
    void Show(){
        super.Show();
        System.out.println("Hola From One");
    }
    abstract void Method1();
}
//abstract class Two2 extends one1{
//    abstract void Message1();
//}
class Sub extends one1 {
    void Show(){
        super.Show();
        System.out.println("Hola From Sub");
    }
    void Method1(){
        System.out.println("Mai hu Method 1");
    }
}
public class AbstractClass2 {
    public static void main(String [] args){
        Sub s=new Sub();
        s.Method1();
        s.Show();
    }
}
