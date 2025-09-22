package Day20Package;
class Square{
    int side1=2;
    int side2=3;
    void Area(){
        float area=side1*side2;
        System.out.println("Area Of Square Is : "+area);
    }
    void perimeter(int side){
        float peri=4*side;
        System.out.println("Perimeter Of Square Is : "+peri);
    }
}
public class OopsPractice2 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.Area();
        sq.perimeter(5);
    }
}
