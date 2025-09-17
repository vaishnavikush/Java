package Day15Package;

public class StaticMethod {
    static int logic(int x,int y){
        int z;
if(x>y){
    z=x-y;
}
else{
    z=x+y;
}
return z;
    }
    public static void main(String[] args){
        int a=2;
        int b=4;
        int c=logic(a,b);
        System.out.println(c);
        int v=45;
        int f=6;
        int e=logic(v,f);
        System.out.println(e);
    }
}
