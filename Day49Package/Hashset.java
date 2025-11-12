package Day49Package;
import java.util.*;
public class Hashset {
    public static void main(String[] args){
        HashSet<Integer>hash1=new HashSet<>();
        hash1.add(45);
        hash1.add(23);
        hash1.add(43);
        hash1.add(78);
        System.out.println(hash1);
        HashSet<Integer>hash2=new HashSet<>(6,0.5f);
        hash2.add(456);
        hash2.add(243);
        hash2.add(437);
        hash2.add(678);
        System.out.println(hash2);
        hash2.addAll(hash1);
        System.out.println(hash2);
        System.out.println(hash2.size());
        System.out.println(hash2.contains(78));
    }
}
