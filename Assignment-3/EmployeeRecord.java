import java.util.*;
public class EmployeeRecord{
    public static void main(String[] args){
        display(args);
    }
    public static void display(String args[]){
         if(args.length!=4)
        {
            System.out.println("Error: Please provide 4 arguments.");
        }
            
        try
        {
            String a=args[0];
            String b=args[1];
            int c=Integer.parseInt(args[2]);
            int d=Integer.parseInt(args[3]);
            System.out.println("===Employee Record===");
            System.out.println("EMPLOYEE ID:"+a);
            System.out.println("EMPLOYEE NAME:"+b);
            System.out.println("DEPARTMENT NUMBER:"+c);
            System.out.println("SALARY:"+d);
         System.out.println("=======================");


        }
        catch(Exception e)
        {
           System.out.println("Invalid input:Dept Number and Salary must be integers.");
        }
    }
}
