package Day37Package;
import java.util.Scanner;
class myclassException extends Exception{
    @Override
    public String toString(){
        return "I am Exception class";
    }
    @Override
    public String getMessage(){
        return "Hola";
    }
}
public class ExceptionClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        myclassException my=new myclassException();
        System.out.println("Enter Number");
        int no= sc.nextInt();
        if(no>9)
            try{
                throw new myclassException();
            }
        catch(Exception e){
                System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
