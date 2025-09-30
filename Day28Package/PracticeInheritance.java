package Day28Package;

abstract class pen{
    abstract void Write();
    abstract void Refill();
}
class FountainPen extends pen{
     void Write(){
        System.out.println("Write");
    }
    void Refill(){
        System.out.println("Refill");
    }
    void ChangeNib(){
        System.out.println("Change the nib");
    }
}
public class PracticeInheritance {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.Refill();
        fp.ChangeNib();
    }
}
