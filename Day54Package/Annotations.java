package Day54Package;

import jdk.jfr.Description;
//@Override Annotation
// @Deprecated Annotation
// @SuppressWarnings Annotation
//@FunctionalInterface Annotation

@FunctionalInterface
interface ok{
    void abstract1();
//    void abstract2();
}

class ride{
   void method(){
        System.out.println("This is Override Annotation One");
    }
    @Deprecated
    int method2(int a,int b){
       return a+b;
    }
}
public class Annotations extends ride {
    @Override
    void method(){
        System.out.println("This is Override Annotation two");
    }
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        ride r1=new ride();
        r1.method();
//      r1.method2(1,2);
        System.out.println(r1.method2(1,2));
        Annotations a1=new Annotations();
        a1.method();
    }
}
