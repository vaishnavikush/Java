package Day26Package;

 abstract class AbstractClass{
    void Method(){
        System.out.println("Hola");
    }
    abstract void Message();
}
class Tow extends AbstractClass{
     void Method(){
         super.Method();
         System.out.println("Monkey");
     }
     void Message(){
         System.out.println("Lufi");
     }
}
public class Abstract {
   public static void main(String[] args){
      Tow to=new Tow();
      to.Method();
      to.Message();
   }
}
