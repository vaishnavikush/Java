package Day18Package;

public class FibonacciSeries extends RuntimeException {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
    public static void main(String[] arg){
//        FibonacciSeries fb=new FibonacciSeries();
//            fibonacci(5);
            System.out.println(fibonacci(9));
    }
}
