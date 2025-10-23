package Day39Package;

public class FinallyBlock {
    public static int greet() {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End Hai Jii Program");
        }
        return 0;
    }
    public static void main(String[] args){
        int re=greet();
        System.out.println("Result is "+re);
    }

}
