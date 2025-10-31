package Day59Package;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args){
        File f1=new File("kush59.txt");
        try{
            f1.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            FileWriter fw=new FileWriter("kush59.txt");
           fw.write("Saiyaara Tu Toh Badla Nahin Hai\n" +
                   "" +
                   "Mausam Zara Sa Rootha Hua Hai\n" +
                   "" +
                   "Saiyaara Tu Toh Badla Nahin Hai\n" +
                   "" +
                   "Mausam Zara Sa Rootha Hua Hai");
           fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
        File fr=new File("kush59.txt");
        try {
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()){
                String read=sc.nextLine();
                System.out.println(read);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
//        File fd=new File("kush59.txt");
//        if(fr.delete()){
//            System.out.println("\nFile Deleted "+fr.getName());
//        }
//        else{
//            System.out.println("File delete nahi hua hai bee");
//        }
    }
}
