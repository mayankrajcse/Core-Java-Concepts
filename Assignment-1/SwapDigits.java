import java.util.*;
public class SwapDigits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.out);
        System.out.println("Enter The First Number");
        int a=sc.nextInt();
        Sytem.out.println("Enter The Second Number:");
        int b=sc.nextInt();
        System.out.println("Before Swapping:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:a="+a+",b="+b);
    }
}
