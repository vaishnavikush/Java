package Day14Package;

public class MinValueArray {
    public static void main(String[] args){
        int []array={10,5,845,2,8};
        int min=array[0];
        for(int i=0;i<array.length;i++){
//            int val=array[0];
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
