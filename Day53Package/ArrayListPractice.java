package Day53Package;
import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Harsh");
        arr.add("Rishi");
        arr.add("Krishna");
        arr.add("Sheetlu");
        arr.add("Vaishnavi");
        arr.add("Jay");
        arr.add("Jyaditya");
        arr.add("Devansh");
        arr.add("Tarun");
        arr.add("Raj");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
