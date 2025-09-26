package Day24Package;

class Parent{
    void Show(){
        System.out.println("Hello From Parent Class");
    }
}
class Child extends Parent {
    @Override
    void Show() {
        super.Show();
        System.out.println("Hello From Child Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Child c1=new Child();
        c1.Show();

    }
}
