package Day14Package;

public class SortedArray {
    public static void main(String[] args){
        boolean isSorted=true;
        int array[]={3,5,6,7,63};
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted==false){
            System.out.println("Array Is Not Sosrted");
        }
        else{
            System.out.println("Array Is Sorted");
        }
    }
}
