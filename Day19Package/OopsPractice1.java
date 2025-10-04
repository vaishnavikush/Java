package Day19Package;

class Employees{
    int salary;
    String name;
    void setName(String n){
        name=n;
    }
     int getSalary(){
       return salary;
    }
    String getName(){
         return name;
    }
}
public class OopsPractice1 {
    public static void main(String[] args){
        Employees e1=new Employees();
        e1.salary=12023;
        e1.setName("Shetlu");
        int gets=e1.getSalary();
        System.out.println(gets);
        String getn=e1.getName();
        System.out.println(getn);
    }

}
