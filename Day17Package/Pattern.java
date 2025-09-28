package Day17Package;

public class Pattern {
    void Pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern pt=new Pattern();
        System.out.println("Pattern In Increasing Order");
            pt.Pattern1(5);
    }
}
