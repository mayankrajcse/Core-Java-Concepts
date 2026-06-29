import java.util.*;
public class CheckNumberType{
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner obj=new Scanner (System.in);
        int num=obj.nextInt();
        if(num>0)
        {
            System.out.print(num);
            System.out.println("is  a positive");
        }
        else if(num<0)
        {
            System.out.print(num);
            System.out.println("is a negative"); 
        }
        else
        {
            System.out.print(num);
            System.out.println("is zero"); 
        }
    }
}
