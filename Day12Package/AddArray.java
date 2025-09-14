package Day12Package;

public class AddArray {
    public static void main(String[] args){
        float sum=0;
        float[] array=new float[5];
        array[0]=1.1f;
        array[1]=2.2f;
        array[2]=3.5f;
        array[3]=4.7f;
        array[4]=5.8f;

        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        float total=0;
        System.out.println("Sum Of Array Is:"+sum);
        System.out.println("---------");
//        for(float element:array);
//        {
//            total = total + element;
//        }
//        System.out.println("Sum Of Array Is:"+total);
    }

}
