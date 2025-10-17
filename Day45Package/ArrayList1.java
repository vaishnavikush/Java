package Day45Package;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args){
       ArrayList<Integer> L1=new ArrayList<>();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(0,4);
//        L1.add(6);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        System.out.println("---------------");
        L1.add(0,5);
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
    }
}
