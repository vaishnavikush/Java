package Day9Package;

public class DecrementLoop {
    public static void main(String [] args){
        for(int i=5;i!=0;i--){
            System.out.println(i);
        }
        System.out.println("Odd Numbers In Reverse Order");
        for(int y=5;y>=0;y--){
            int odd=2*y+1;
            System.out.println(odd);
        }
    }
}
