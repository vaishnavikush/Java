package Day18Package;

public class Average {
    void avg1(float n,float m){
        float avg1=(m+n)/2;
        System.out.println(avg1);
    }
    void avg2(float m,float n,float s){
        float avg2=(m+n+s)/3;
        System.out.println(avg2);
    }
    void avg3(float l,float k,float p,float e){
        float avg3=(l+k+p+e)/4;
        System.out.println(avg3);
    }
    public static void main(String[] args){
        Average avg=new Average();
        avg.avg1(2,5);
        avg.avg2(3,6,7);
        avg.avg3(30.4f,70.5f,3,56.5f);
    }
}
