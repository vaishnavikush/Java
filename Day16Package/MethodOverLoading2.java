package Day16Package;

public class MethodOverLoading2 {
    void Sum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

    void Sum(int a,int b,int n){
        int c=a+b+n;
        System.out.println(c);
    }
    public static void main(String[] args){
        MethodOverLoading2 ma=new MethodOverLoading2();
        ma.Sum(4,3);
        ma.Sum(3,5,6);
    }
}
