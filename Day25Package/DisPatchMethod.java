package Day25Package;

class parent11{
    int a;
    public void Show(){
        System.out.println("Hola");
    }
    public void getA() {
        System.out.println(a);
    }

    public void setA(int a) {
        this.a = a;
    }
}
class child11 extends parent11{
    int y;

    public void Show() {
        super.Show();
        System.out.println("Hola.....");
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class DisPatchMethod {
    public static void main(String [] args){
        parent11 p=new child11();
//        p.setY();
//        p.getY();
        p.setA(2);
        p.getA();
        p.Show();
    }
}
