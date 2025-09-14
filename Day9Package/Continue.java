package Day9Package;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Continue By Using For Loop");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Loop Is Continues");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Loop Ends Here");
        System.out.println("------------");
        System.out.println("Continue By Using While Loop");
        int i=0;
        while(i<5){
            i++;
            if(i==2){
                System.out.println("Loop Is Continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Loop Ends Here");
        System.out.println("------------");
        System.out.println("Continues By Using Do While Loop");
        i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Loop Is Continue");
                continue;
            }
            System.out.println(i);
        }while(i<5);
        System.out.println("Loop Ends Here");
    }
    }


