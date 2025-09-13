package Day11Package;

public class ArrayReverse {
    public static void main(String[] args){
        System.out.println("Array Reserve By Using For Loop");
        int []arr1={1,2,3,4,5};
//        System.out.println(arr1.length);
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }
        System.out.println("Array Reserve By Using While Loop");
        int []arr2={1,2,3,4,5};
        int y=arr2.length-1;
        while(y>=0){
            System.out.println(arr2[y]);
            y--;
        }
        System.out.println("Array Reserve By Using Do While Loop");
        int []arr3={1,2,3,4,5};
        int x=arr3.length-1;
        do{
            System.out.println(arr3[x]);
            x--;
        }while(x>=0);
    }
}
