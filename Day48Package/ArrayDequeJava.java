package Day48Package;
import java.util.*;
public class ArrayDequeJava {
    public static void main(String[] args){
        ArrayDeque<Integer>Arrd1=new ArrayDeque<>();
        Arrd1.add(7);
        Arrd1.add(2);
        Arrd1.add(1);
        Arrd1.add(6);
        System.out.println(Arrd1.getFirst());
        System.out.println(Arrd1.getLast());
        System.out.println(Arrd1.getClass());
        for(Integer element:Arrd1) {
                System.out.println(element);
            }
        System.out.println("------------");
        Arrd1.addFirst(0);
        Arrd1.addLast(10);
        for(Integer element:Arrd1){
            System.out.println(element);
        }
    }
}
