package Day23Package;

class Base{
   int x;
   public void set(int x){
       this.x=x;
   }
   public void get(){
       System.out.println("Value of x is "+x);
   }
}
class Child extends Base{
   int y;
  public  void setter(int y){
       this.y=y;
   }
  public  void getter(){
       System.out.println("Value of y is "+y);
   }
}
public class Inheritance {
    public static void main(String[] args){
        Child c1=new Child();
        System.out.println("Calling by the Child object");
             c1.set(101);
             c1.get();
             c1.setter(102);
             c1.getter();
         Base b1=new Base();
        System.out.println("Calling by the Base object");
            b1.set(201);
            b1.get();
//          b1.setter(202);
//          b1.getter();
    }
}
