package Day22Package;
import java.util.Scanner;

class Cylinder{
    float radius;
    float height;
    void setCylinder(float radius,float height){
        this.radius=radius;
        this.height=height;
    }
    void getCylinder(){
        System.out.println("Radius of cylinder is : "+radius);
        System.out.println("Height of cylinder is : "+height);
    }
}
public class CylinderClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Cylinder cy=new Cylinder();
        System.out.println("Enter Cylinder Radius");
        float r=sc.nextFloat();
        System.out.println("Enter Cylinder Height");
        float h=sc.nextFloat();
        cy.setCylinder(r,h);
        cy.getCylinder();
    }
}
