package Day57Package;
import java.util.ArrayList;
class MyGeneric<T1>{
    int val;
    private T1 t1;

    public MyGeneric(int val,T1 t1) {
        this.t1 = t1;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

}
public class Generic {
    public static void main(String[] args){
       MyGeneric<String>g1=new MyGeneric(77,"Hii...");
       String str=g1.getT1();
       int int2=g1.getVal();
       System.out.println(str);
        System.out.println(int2);
    }
}
