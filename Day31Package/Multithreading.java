package Day31Package;

class one extends Thread {
    @Override
    public void run(){
    int i=0;
    while(i<10)
    {
        System.out.println("\nThread Is Running From Class One");
        i++;
    }
    }
}
class two extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<10) {
            System.out.println("\nThread Is Running From Class Two");
            i++;
        }
    }
}
public class Multithreading {
    public static void main(String[] args){
        one on=new one();
        two to=new two();
        on.start();
        to.start();
    }
}
