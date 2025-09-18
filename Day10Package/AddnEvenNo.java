package Day10Package;

public class AddnEvenNo {
    public static void main(String []args){
        int n=4;
        int sum=0;
        System.out.println("By Using For Loop");
        for(int i=0;i<n;i++){
          sum=sum+(2*i);
        }
        System.out.println(sum);
        System.out.println("By Using While Loop");
        int y=0;
        int k=5;
        int total=0;
        while(y<k){
            total=total+(2*y);
            y++;
        }
        System.out.println(total);
    }

}
