package Day21Package;

class Parameterised{
    int id;
    String name;
    Parameterised(){//Default Constructor
        System.out.println("It is a default constructor");
    }
    Parameterised(int id){//Parameter Constructor
        this.id=id;
    }
    Parameterised(String name){
        this.name=name;
    }
    Parameterised(int id,String name){
         this.id=id;
         this.name=name;
    }
    Parameterised(String name,int id){
        this.id=id;
        this.name=name;
    }
    void getid(){//Getter Method
        System.out.println(id);
    }
    void getName(){
        System.out.println(name);
    }
    void get(){
        System.out.println("Id Is : "+id);
        System.out.println("Name Is : "+name);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args){
       Parameterised p=new Parameterised();//Default Constructor Called Here
       Parameterised p1=new Parameterised(101);//Parameter Constructor Call Here
       p1.getid();
       Parameterised p2=new Parameterised("Sheetlu");
       p2.getName();
       Parameterised p3=new Parameterised(102,"Krishna");
       p3.get();
       Parameterised p4=new Parameterised(103,"Harsh");
       p4.get();
    }
}
