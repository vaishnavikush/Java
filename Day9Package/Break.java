package Day9Package;

public class Break {
    public static void main(String[] args){
        System.out.println("Break By Using For Loop");
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==2){
                System.out.println("Loop Is Break");
                break;
            }
        }
        System.out.println("Loop Ends Here");
        System.out.println("------------");
        System.out.println("Break By Using While Loop");
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
            if(i==2){
                System.out.println("Loop Is Break");
                break;
            }
        }
        System.out.println("Loop Ends Here");
        System.out.println("------------");
        System.out.println("Break By Using Do While Loop");
      i=0;
        do{
        System.out.println(i);
            i++;
        if(i==2){
            System.out.println("Loop Is Break");
            break;
        }
        }while(i<5);
        System.out.println("Loop Ends Here");
    }

}
