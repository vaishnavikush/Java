package Day29Package;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    void ring(){
        System.out.println("Phone Ring");
    }
    void lift(){
        System.out.println("Phone Lift");
    }
    void disconnect(){
        System.out.println("Phone Disconnect");
    }
    void hold(){
        System.out.println("Phone Hold");
    }
}
public class PracticePolyInheritance {
    public static void main(String[] args){
        TelePhone sp=new SmartTelePhone();
        sp.ring();
        sp.lift();
        sp.disconnect();
        //sp.hold();
        System.out.println("---------------");
        SmartTelePhone sm=new SmartTelePhone();
        sm.ring();
        sm.lift();
        sm.disconnect();
        sm.hold();
    }
}
