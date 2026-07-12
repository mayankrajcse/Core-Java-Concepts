import java.util.*;
public class CommandLineAddition {
    public static void main(String args[])
    {
        int a,b,c;
        try{
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("sum of "+a+  +b+ ":"+c);
        }
        catch(Exception e) //class file
        {
            System.out.println(e);

        }
    }
}