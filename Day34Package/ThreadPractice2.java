package Day34Package;

class prac1 extends Thread{
    public void run(){
        System.out.println("What About");
    }
}
class prac2 extends Thread{
    public void run(){
        System.out.println("Me....");
    }
}
public class ThreadPractice2 {
    public static void main(String[] args){
        prac1 p1=new prac1();
        prac2 p2=new prac2();
        System.out.println( p2.getState());
        p1.start();
        p2.start();
        p1.setPriority(4);
        p2.setPriority(6);
        System.out.println( p1.getPriority());
        System.out.println( p2.getPriority());
        System.out.println( p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
