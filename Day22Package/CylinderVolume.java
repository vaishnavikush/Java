package Day22Package;

import java.util.Scanner;

class volume{
    float radius;
    float height;
    float volume;
    float area;
    void setCylinder(float radius,float height){
        this.radius=radius;
        this.height=height;
    }
    void VolumeCylinder(){
        volume=3.14f*radius*radius*height;
    }
    void AreaCylinder(){
        area=2*3.14f*radius*(radius+height);
    }
    void getCylinder(){
        System.out.println("Radius of cylinder is : "+radius);
        System.out.println("Height of cylinder is : "+height);
    }
    void getVolume(){
        System.out.println("Volume of cylinder is : "+volume);
    }
    void getAreaa(){
        System.out.println("Area of cylinder is : "+area);
    }
}
public class CylinderVolume {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        volume cy=new volume();
        System.out.println("Enter Cylinder Radius");
        float r=sc.nextFloat();
        System.out.println("Enter Cylinder Height");
        float h=sc.nextFloat();
        cy.setCylinder(r,h);
        cy.getCylinder();
        cy.VolumeCylinder();
        cy.getVolume();
        cy.AreaCylinder();
        cy.getAreaa();
    }
}

