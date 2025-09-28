package Day17Package;

import Day10Package.FactorialProgram;

public class Recursion {
    static int recursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * recursion(n-1);
        }
    }
//    static int  recursion2(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            int rec=1;
//            for(int i=1;i<=n;i++){
//                rec *=i;
//            }
//            return rec;
//        }
//    }

    public static void main(String[] args){
        System.out.println(recursion(5));
    }
}
