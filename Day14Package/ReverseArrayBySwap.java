package Day14Package;

public class ReverseArrayBySwap {
    public static void main(String []args){
        int []array={7,6,5,4,3,2,1};
        int len=array.length;
        int n=Math.floorDiv(len,2);
        int temp;
        for(int i=0;i<n;i++){
            temp=array[i];
            array[i]=array[len-i-1];
            array[len-i-1]=temp;
//            System.out.println(temp);
        }
        for(int element:array){
            System.out.println(element);
        }

    }
}
