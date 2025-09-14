package Day12Package;

public class TwoDArray {
    public static void main(String[] args){
        int [][] TwoArray=new int[2][3];
        TwoArray[0][0]=101;
        TwoArray[0][1]=102;
        TwoArray[0][2]=103;
        TwoArray[1][0]=201;
        TwoArray[1][1]=202;
        TwoArray[1][2]=203;
        for(int i=0;i<TwoArray.length;i++){
            for(int j=0;j<TwoArray[i].length;j++){
                System.out.println(TwoArray[i][j]);
            }
        }

    }
}
