package Day5Package;

public class PracticeStringMethods {
    public static void main(String [] args){
        System.out.println("Converting String To Lower Case");
        String name="Kuch Bhe";
        name=name.toLowerCase();
        System.out.println(name);
        System.out.println("________");

        System.out.println("Replace Space With Underscore");
        String name1="Kuch Tho Hai Be";
        name1=name1.replace(" ","_");
        System.out.println(name1);
        name1=name1.replace("Hai","No");
        System.out.println(name1);
        System.out.println("________");

        System.out.println("Replacing Name");
        String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Customer");
        System.out.println(letter);
        System.out.println("________");


    }
}
