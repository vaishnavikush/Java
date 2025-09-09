package Day4Package;

public class StringMethods2 {
    public static void main(String[] args){
        String name="VaisHnavi";
        System.out.println(name.charAt(4));//H
        System.out.println(name.charAt(7));//v
        String name2="   vaishnavi   ";
        System.out.println(name2);//"   vaishnavi    ";
        System.out.println(name2.trim());//vaishnavi
        System.out.println(name.indexOf('v'));//7
        System.out.println(name.indexOf("na"));//5
        System.out.println(name.indexOf('k'));//-1
        System.out.println(name.indexOf('a',4));//6 (find index of 'a' and start from index 4)
        System.out.println(name.lastIndexOf('i'));//8
        System.out.println(name.lastIndexOf('a'));//6
        System.out.println(name.lastIndexOf("nv"));//-1
        System.out.println(name.lastIndexOf('n'));//5
        System.out.println(name.lastIndexOf('a',4));//1 (find index of 'a' and start before index 4)
        System.out.println(name.lastIndexOf('i',3));//2 (find index of 'i' and start before index 3)
        System.out.println(name.equals("vaishnavi"));//false
        System.out.println(name.equals("VaisHnavi"));//true
        System.out.println(name.equalsIgnoreCase("vaishnavi"));//true (it ignore case)

    }
}
