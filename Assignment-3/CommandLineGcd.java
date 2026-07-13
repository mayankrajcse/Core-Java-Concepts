import java.util.*;
public class CommandLineGcd{
    public static void main(String args[])
    {
        if(args.length!=2)
        {
            System.out.println("Error:Please enter two integer..");
            return;
        }
        try
        {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int rem;
        
        while(a%b!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("GCD IS:"+b);
    }
    catch(Exception e)
    {
      System.out.println("Invalid input:");
    }
    }
    
}
