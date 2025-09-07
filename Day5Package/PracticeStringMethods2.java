package Day5Package;

public class PracticeStringMethods2 {
    public static void main(String [] args){

        System.out.println("Detecting Double And Triple Spaces");
        String letter1="I  Am   Learning Java";
        System.out.println(letter1.indexOf("  "));
        System.out.println(letter1.indexOf("   "));
        System.out.println("________");

        System.out.println("Using Escape Sequence Character");
        String str="Dear Customer,Thanks for visiting this site.Thank you!!";
        str="Dear Customer,\n\tThanks for visiting this site.\n\tThank you!!";
        System.out.println(str);
        System.out.println("________");

    }
}
