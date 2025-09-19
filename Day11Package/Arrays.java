package Day11Package;

public class Arrays {
    public static void main(String[] args){
        System.out.println("First Option Of Declaring Array");
        int [] array1=new int[5];
        array1[0]=5;
        array1[1]=4;
        array1[2]=3;
        array1[3]=2;
        array1[4]=1;
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println("------------");
        System.out.println("Second Option Of Declaring Array");
        int []array2;
        array2=new int[5];
        array2[0]=1;
        array2[1]=2;
        array2[2]=3;
        array2[3]=4;
        array2[4]=5;
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println("------------");
        System.out.println("Third Option Of Declaring Array");
        int []array3={2,3,45,6,78,8};
        System.out.println(array3[2]);
        System.out.println(array3[3]);
        System.out.println("------------");

    }
}
