package Day15Package;

public class NonStaticMethod {
    int logic(int x,int y){
        int z=x*y;
        return z;
    }
    public static void main(String[] args){
        int m=2;
        int n=4;
        NonStaticMethod non=new NonStaticMethod();
        int p=non.logic(m,n);
        System.out.println(p);
    }
}
