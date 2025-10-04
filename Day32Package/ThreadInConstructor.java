package Day32Package;

class const1 extends Thread{
    public const1(String name){
        super(name);
    }
//    public const1(Runnable r){
//
//    }
}
public class ThreadInConstructor {
    public static void main(String[] args){
        const1 c1=new const1("Happy");
        const1 c2=new const1("MahaHappy");
        System.out.println("\nId of this Thread is:"+c1.getId());
        System.out.println("\nName of this Thread is:"+c1.getName());
        System.out.println("\nId of this Thread is:"+c2.getId());
        System.out.println("\nName of this Thread is:"+c2.getName());
    }
}
