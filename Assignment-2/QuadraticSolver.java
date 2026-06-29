import java.util.*;
import java.lang.Math;
public class QuadratiSolver {
    public static void main(String[]args){
        float d,x1,x2;
        System.out.println("enter the value of a and b\n");
        Scanner obj=new Scanner(System.in);
        float a=obj.nextFloat();
        float b=obj.nextFloat();
        float c=obj.nextFloat();
         d=(b*b)-4*a*c;
         if(d<0)
         {
            x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1:"+x1);
            System.out.println("x2:"+x2);
            System.out.println("IMAGINARY ROOTS");


         }
         else if(d==0)
         {
            x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1:"+x1);
            System.out.println("x2:"+x2);
            System.out.println("BOTH ROOTS ARE EQUAL");
         }
         else if(d>0)
         {
            x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1:"+x1);
            System.out.println("x2:"+x2);
            System.out.println("REAL ROOTS");
         }
    }
}
