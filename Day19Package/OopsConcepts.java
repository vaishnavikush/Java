package Day19Package;

 class Employee{
    int id;
    String name;
    float salary;
    void getEmployee(){
        System.out.println("Employee Id Is : "+id);
        System.out.println("Employee Name Is : "+name);
        System.out.println("Employee Salary Is : "+salary);
    }
}
public class OopsConcepts {
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.id=101;
        e1.name="Krishan";
        e1.salary=1200;
        e1.getEmployee();

        e2.id=102;
        e2.name="Harsh";
        e2.salary=1210;
        e2.getEmployee();
    }
}
