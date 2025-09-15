package Day13Package;

public class averageFromArray {
    public static void main(String[] args){
        System.out.println("Finding Average By Using For-Each Loop");
        float []array={3.7f,5.4f,7.34f,8.34f,4};
        float avg=0;
        for(float element:array){
           avg=avg+element;
        }
        System.out.println("The Average Marks Is:"+avg/array.length);
    }
}
