package Day20Package;

class Rectangle{
    float width=8;
    float length=89;
    void Area(){
        float area= width*length;
        System.out.println("Area Of Rectangle Is : "+area);
    }
    void Perimeter(){
        float peri=(length+width)*2;
        System.out.println("Perimeter Of Rectangle Is : "+peri);
    }
}
public class OopsPractice3 {
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.Area();
        r.Perimeter();
    }
}
