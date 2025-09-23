package Day21Package;

class Private{
    private int id;
    private String name;
    void setPrivate(int i,String n){
        id=i;
        name=n;
    }
    void getPrivate(){
        System.out.println("Id Is : "+id);
        System.out.println("Name IS : "+name);
    }
}
public class PrivateAccessModifier {
    public static void main(String [] args){
        Private p=new Private();
//        id=101;  We CanNot Access Id And Name OutSide The Because Of Private Access Modifier.....
//        name="jsd";
        p.setPrivate(101,"PataNaa");
        p.getPrivate();
    }
}
