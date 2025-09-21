package Day13Package;

public class MaxValueArray {
    public static void main(String[] args){
        int[]array={4,6,123,700,5};
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
