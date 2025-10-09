package Day24Package;
class Parent1{
    void Show(int a,int b){
       int c=a+b;
       System.out.println("Sum of Two No. : "+c);
    }
}
class Child1 extends Parent1 {
    @Override
    void Show(int a,int b) {
        super.Show(2,1);
        int c=a-b;
        System.out.println("Subtraction of Two No. : "+c);
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.Show(1,2);

    }
}
