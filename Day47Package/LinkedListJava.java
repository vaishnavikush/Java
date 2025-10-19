package Day47Package;

import java.util.LinkedList;

public class LinkedListJava {
   public static void main(String[] args){
       LinkedList<Integer>Link1=new LinkedList<>();
       Link1.add(3);
       Link1.add(6);
       Link1.add(8);
       Link1.add(9);
       for(int i=0;i<Link1.size();i++){
           System.out.println(Link1.get(i));
       }
       System.out.println("--------------");
       LinkedList<Integer>Link2=new LinkedList<>();
       Link2.add(64);
       Link2.add(54);
       Link2.add(77);
       Link2.add(45);
       for(int i=0;i<Link2.size();i++){
           System.out.println(Link2.get(i));
       }

   }
}
