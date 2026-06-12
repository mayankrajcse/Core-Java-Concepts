import java.util.*;
public class p9{
    public  static void main(String[]args){
        int num;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        if(num%2==1||num==2)
        {
            System.out.print(num);
            System.out.println(" is a prime no");
        }
        else
        {
            System.out.print(num);
            System.out.println("it not a prime");
        }

    }
}