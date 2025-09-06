package Day4Package;

public class StringMethods {
    public static void main(String[] args){
        String name="VaisHnavi";
        System.out.println(name.length());//9
        System.out.println(name.toLowerCase());//vaishnavi
        System.out.println(name.toUpperCase());//VAISHNAVI
        System.out.println(name.substring(5));//navi
        System.out.println(name.substring(3,7));//sHna
        System.out.println(name.replace('i','p'));//VapsHnavp
        System.out.println(name.replace("navi","chan"));//VaisHchan
        System.out.println(name.startsWith("vai"));//false
        System.out.println(name.startsWith("Vai"));//true
        System.out.println(name.startsWith("Kus"));//false
        System.out.println(name.endsWith("navi"));//true
        System.out.println(name.endsWith("Chan"));//false

    }
}
