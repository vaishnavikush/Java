package Day34Package;

class Good extends Thread{
    public void run() {
        while(true) {
                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            System.out.println("Good Morning");
        }
    }
}


class Sad extends Thread {
    public void run() {
        while(true) {
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args){
        Good g=new Good();
        Sad s=new Sad();
        g.start();
        s.start();
    }
}
