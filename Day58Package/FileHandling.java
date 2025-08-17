package Day58Package;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class FileHandling {
    public static void main(String[] args){
        //File Create//
        File myfile=new File("vk58file.txt");
        try {
            myfile.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }
        //Write in file//
        try {
            FileWriter myfilewriter = new FileWriter("vk58file.txt");
            myfilewriter.write("This is my first file in this java course");
            myfilewriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
        //Read From file//
        File myFileread=new File("vk58file.txt");
        try {
//            FileReader myfilereader = new FileReader("vk58file.txt");
            Scanner sc=new Scanner(myFileread);
            while(sc.hasNextLine()){
                String read=sc.nextLine();
                System.out.println(read);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
        //File Delete//
          File myfiledelete=new File("vk58file.txt");
                 if(myfiledelete.delete()){
                        System.out.println("File Deleted : "+myfiledelete.getName());
                 }
                else{
                 System.out.println("Some Problem occurred during Deleting the File");
           }
    }
}
