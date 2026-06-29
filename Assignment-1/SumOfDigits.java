import java.util.*;
public class SumOfDigits{
    public static void main(String[]args){
        int num,sum=0,rem;
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of digit of the number:"+sum);
    }

}
