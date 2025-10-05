package Day33Package;

class MyThread11 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Hola");
            i++;
        }
    }
}
class MyThread22 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while (i < 10) {
            System.out.println("Tata");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args){
        MyThread11 m1=new MyThread11();
        MyThread22 m2=new MyThread22();
                m1.start();
                try{
                    m1.join();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                m2.start();
    }
}
