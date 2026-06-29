import java.util.*;
public class AverageMarks{
    public static void main(String[]args){
        int avg;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the marks of 3 subject : ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        avg=(a+b+c)/3;
        System.out.print("Average Mark:");
        System.out.println(avg);


    }
}
