package Day27Package;

interface One{
   public void ShowOne();
}
interface Two{
    void ShowTwo();
}
class Three{
    void Call(){
        System.out.println("Call From Class Three");
    }
}
class mainClass extends Three implements One,Two {
  public void ShowOne(){
        System.out.println("Show One");
    }
   public void ShowTwo(){
            System.out.println("Show Two");
    }
    public void Call(){
        System.out.println("Call From Main Class");
    }

}
public class Interface {
    public static void main(String[] args){
        mainClass m=new mainClass();
        m.ShowOne();
        m.ShowTwo();
        m.Call();
    }
}
