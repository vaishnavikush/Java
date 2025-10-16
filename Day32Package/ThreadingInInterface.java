package Day32Package;

class MyThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("\nThreading In Interface One");
            i++;
        }
    }
}
class MYThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("\nThreading In Interface Two");
            i++;
        }
    }
}

public class ThreadingInInterface {
    public static void main(String[] args){
        MyThread1 bullet1=new MyThread1();
        Thread gun1=new Thread(bullet1);

        MYThread2 bullet2=new MYThread2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
