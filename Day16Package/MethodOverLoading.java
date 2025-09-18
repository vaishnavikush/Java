package Day16Package;

import java.lang.invoke.MethodHandle;

public class MethodOverLoading {
    static void Show() {
        System.out.println("Kya Bolti");
    }
    static void Show(int a){
        System.out.println("Public");
    }
    static void Show(int a,int b){
        System.out.println("Kuch Nahi");
    }
    void Display(){
        System.out.println("Hello.....");
    }
    void Display(int x){
        System.out.println("Haa...");
    }
    void Display(int x,int y){
        System.out.println("Kuch Nahi");
    }

    public static void main(String[] args) {
        System.out.println("Method OverLoading By Static Method");
                 Show();
                 Show(1);
                 Show(1,2);
        System.out.println("----------");
        System.out.println("Method OverLoading By Non Static Method");
        MethodOverLoading md=new MethodOverLoading();
                md.Display();
                md.Display(1);
                md.Display(1,2);
    }
}