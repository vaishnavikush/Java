package Day48Package;
import java.util.*;
public class LinkedListJava2 {
    public static void main(String[] args){
        LinkedList<Integer>Link1=new LinkedList<>();
        Link1.add(65);
        Link1.add(87);
        Link1.add(22);
        Link1.add(79);
        for(int i=0;i<Link1.size();i++){
            System.out.println(Link1.get(i));
        }
        System.out.println(Link1.contains(876));
        System.out.println("-------------");
        LinkedList<Integer>Link2=new LinkedList<>();
        Link2.add(745);
        Link2.add(213);
        Link2.add(876);
        Link2.add(986);
        for(int i=0;i<Link2.size();i++){
            System.out.println(Link2.get(i));
        }
        System.out.println("-------------");
        Link1.addAll(Link2);
        for(int i=0;i<Link1.size();i++) {
            System.out.println(Link1.get(i));
        }
        System.out.println("-------------");
        Link1.addAll(0,Link2);
        for(int i=0;i<Link1.size();i++) {
            System.out.println(Link1.get(i));
        }
        System.out.println(Link1.contains(876));
    }

}
