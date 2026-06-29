import java.util.*;
public class PositiveNegative{
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        if(num>0)
        {
            System.out.print(num);
            System.out.println(" is a positive number");
        }
        else
        {
            System.out.print(num);
            System.out.println("is a negative number");
        }



    }
}
