import java.util.*;
public class PalindromeNumber {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        int digit;
        int original_num=num;
        while(num>0)
        {
            digit=num%10;//1
            reverse=(reverse*10)+digit;
            num=num/10;
        }
            if(reverse==original_num)
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }
    }
}
