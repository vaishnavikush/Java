package Day46Package;
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<>();
        Arr1.add(4);
        Arr1.add(46);
        Arr1.add(84);
        for (int i = 0; i < Arr1.size(); i++) {
            System.out.println(Arr1.get(i));
//            System.out.println();
        }
        Arr1.clear();
        for (int i=0; i<Arr1.size(); i++) {
            System.out.println(Arr1.get(i));
        }
        System.out.println("------------");
        Arr1.add(3);
        Arr1.add(6);
        Arr1.add(3);
        for (int i=0; i<Arr1.size(); i++) {
            System.out.println(Arr1.get(i));
        }
        System.out.println( Arr1.contains(3));
        System.out.println( Arr1.contains(34));
//        System.out.println( Arr1.indexOf(6));
    }
}