package Day19Package;
import java.util.Scanner;

public class CalciumToFahrenheit {
    void Temperature(float calcium){
        float fahrenheit=0;
        fahrenheit=(calcium*9/5)+32;
        System.out.println(fahrenheit+"F");
    }
public static void main(String[] args){
    CalciumToFahrenheit  temp=new CalciumToFahrenheit();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Temperature In Calcium : ");
    float tempCal=sc.nextFloat();
    temp.Temperature(tempCal);
}
}
