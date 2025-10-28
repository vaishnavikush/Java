package Day56Package;

@FunctionalInterface
interface Demo{
    void Lambda1();
//    void Lambda2();
}
// class Demo2 implements Demo{
//   public void Lambda1(){
//        System.out.println("Bhai Mai Hu Lambda 1");
//    }
//   public void Lambda2(){
//        System.out.println("Bhai Mai Hu Lambda 2");
//    }
//}
public class LambdaExpression {
    public static void main(String[] args){
//        Demo obj1=new Demo2();
//        obj1.Lambda1();
//        obj1.Lambda2();

        //By Lambda Expression
        Demo obj2=()->{
            System.out.println("Bhai Mai Hu Method 1 But Lambda Expression Ki Madat Se");
        };
        obj2.Lambda1();
    }
}
