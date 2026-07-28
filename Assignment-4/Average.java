import java.util.*;
public class Average {
    public static void Average(float a,float b,float c){
        float avg=(a+b+c)/3;
        System.out.println("Average:"+avg);
    }
}
class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        float a=sc.nextFloat();
        System.out.println("Enter the number:");
        float b=sc.nextFloat();
        System.out.println("Enter the number:");
        float c=sc.nextFloat(); 
        Average obj = new Average();
        obj.Average(a, b, c);
    }
}

