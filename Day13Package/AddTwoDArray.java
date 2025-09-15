package Day13Package;

public class AddTwoDArray {
    public static void main(String[] args){
        int [][]mar1={{2,3,6},
                {4,8,5}};
        int [][]mar2={{1,5,3},
                {5,2,1}};
        int [][]result={{0,0,0},
                {0,0,0}};
        for(int i=0;i<mar1.length;i++){
            for(int j=0;j<mar1[i].length;j++){
                result[i][j]=mar1[i][j]+mar2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.print(" "+"\n");
        }
    }
}
