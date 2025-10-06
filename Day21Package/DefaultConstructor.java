package Day21Package;

class Default{
    int id;
    String name;
    Default(){  //It is a default constructor
        id=101;
        name="Harsha";
    }
//    Default(){  //We cannot overload Default constructor
//        id=102;
//        name="Har";
//    }
    void getDefault(){
        System.out.println("Id Is : "+id);
        System.out.println("Name Is : "+name);

    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
    Default d=new Default();//here default constructor is called by the object
        Default d1=new Default();//We Can Call Default Constructor By Making Another Object
        d.getDefault();
        d1.getDefault();
    }
}
