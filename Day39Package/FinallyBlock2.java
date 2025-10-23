package Day39Package;

public class FinallyBlock2 {
    public static void main(String[] args) {
        int b = 5;
        while (b!=0) {
            int a = 100;
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("I am Finally "+b);
            }
            b--;
        }
        try{
            System.out.println("Hola");
        }
        finally{
            System.out.println("I am Second Finally");
        }
    }
}