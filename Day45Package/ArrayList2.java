package Day45Package;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args){
        System.out.println("Values Of Array1");
        ArrayList<Integer>L1=new ArrayList<>();
        L1.add(3);
        L1.add(2);
        L1.add(6);
        L1.add(7);
        L1.add(9);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        System.out.println("Values Of Array2");
        ArrayList<Integer>L2=new ArrayList<>();
        L2.add(57);
        L2.add(46);
        L2.add(87);
        for(int i=0;i<L2.size();i++){
            System.out.println(L2.get(i));
        }
        System.out.println("Values Of Array2 From Index Zero");
        L1.addAll(0,L2);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        System.out.println("Values Of Array1 After Copying The Values Of Array2 In Array1");
        L1.addAll(L2);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        System.out.println("Values Of Array2 From Index Zero");
        L1.addAll(0,L2);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }

    }
}
