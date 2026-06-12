import java.util.*;
public class p5{
    public static void main(String[]args)
    {
       Scanner obj=new Scanner(System.in);
       int num=obj.nextInt();
       if(num%2==0)
        {
            System.out.print(num);
            System.out.println(" is even");
        } 
        else
        {
            System.out.println(num);
            System.out.println(" is odd");
        }
    }
}