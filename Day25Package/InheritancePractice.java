package Day25Package;

class Rectangle{
   double length=20;
   double width=10;
   void Area(){
       double c=length*width;
       System.out.println("Area of Rectangle : "+c);
   }
}
class Cuboid extends Rectangle{
    double height=6;
    void Area(){
        super.Area();
        double m=2*((length*width)+(width*height)+(height*length));
        System.out.println("Area of cuboid : "+m);
    }
}
public class InheritancePractice {
    public static void main(String[] args){
        Cuboid c=new Cuboid();
        c.Area();
    }
}
