package Day28Package;

interface Name{
    void setName(String name);
    void getName();
}
interface Class{
    void setClass(int Class);
    void GetClass();
}
class age implements Name,Class{
    String name;
    int Class;
  public void setName(String name){
       this.name=name;
   }
   public void getName(){
      System.out.println("Name : "+name);
   }
   public void setClass(int Class){
      this.Class=Class;
   }
   public void GetClass(){
      System.out.println("Class : "+Class);
   }
}
public class PolymorphismInInheritance {
    public static void main(String [] args){
        Name nm=new age();
        //nm.setClass();
        //nm.GetClass();
        nm.setName("Kuch");
        nm.getName();
        System.out.println("------------");
        age ag=new age();
        ag.setName("Pata");
        ag.getName();
        ag.setClass(12);
        ag.GetClass();
    }
}
