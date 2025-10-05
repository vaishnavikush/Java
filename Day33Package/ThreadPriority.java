package Day33Package;

class Prior extends Thread {
    public Prior(String name) {
       super(name);
    }
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("Name Is :" +this.getName());
            i++;
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args){
        Prior p1=new Prior("happy");
        Prior p2=new Prior("sad");
        Prior p3=new Prior("UnHappy");
        Prior p4=new Prior("TikTok");
        Prior p5=new Prior("Insta");
        p3.setPriority(Thread.MAX_PRIORITY);
        p1.setPriority(Thread.MIN_PRIORITY);
        p5.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
