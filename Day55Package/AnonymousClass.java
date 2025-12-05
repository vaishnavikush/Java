package Day55Package;

 interface Demo{
     void Method1();
     void Method2();
}
public class AnonymousClass {
//   public void Method1(){
//        System.out.println("I am Method1");
//    }
//   public void Method2(){
//       System.out.println("I am Method2");
//    }
    public static void main(String[] args) {
//       AnonymousClass obj1=new AnonymousClass();
//       obj1.Method1();
//       obj1.Method2();

        Demo obj2 = new Demo() {
            @Override
            public void Method1() {
                System.out.println("This is Method1");
            }

            @Override
            public void Method2() {
                System.out.println("This is Method2");
            }
        };
        obj2.Method1();
        obj2.Method2();
    }
 }
